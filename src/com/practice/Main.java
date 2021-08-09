package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      Main.matchBenchmark(line);
    }
  }
  
  public static void matchBenchmark(String input) {
    String portfolio= input.substring(0,input.indexOf(":"));
    String benchmark= input.substring(input.indexOf(":")+1);
    
    String[] portfolioAssetsStr=portfolio.split("\\|");
    String[] benchmarkAssetsStr=benchmark.split("\\|");
    
    Asset portfolioAsset[]=new Asset[portfolioAssetsStr.length];
    Asset benchmarkAsset[]=new Asset[benchmarkAssetsStr.length];
    
    for(int i=0;i<portfolioAssetsStr.length;i++){
      String[] fields=portfolioAssetsStr[i].split(",");
      portfolioAsset[i]=new Asset(fields[0],fields[1],Integer.parseInt(fields[2]));
    }
    
    for(int i=0;i<benchmarkAssetsStr.length;i++){
      String[] fields=benchmarkAssetsStr[i].split(",");
      benchmarkAsset[i]=new Asset(fields[0],fields[1],Integer.parseInt(fields[2]));
    }
    
    boolean found;
    boolean[] benchmarkFound=new boolean[benchmarkAsset.length];
    
    for(int i=0;i<benchmarkAsset.length;i++){
       benchmarkFound[i]=false;
    }
    Transaction[] transactions=null;
    for(int i=0;i<portfolioAsset.length;i++){
      found=false;
      for(int j=0;j<benchmarkAsset.length;j++){
        if(portfolioAsset[i].compareTo(benchmarkAsset[j])==0){
          if(portfolioAsset[i].getShares()>benchmarkAsset[j].getShares()){
            if(transactions==null)
              transactions=new Transaction[1];
            else
              transactions=Arrays.copyOf(transactions,transactions.length+1);
            transactions[transactions.length-1]=new Transaction("SELL",new Asset(portfolioAsset[i].getName(),portfolioAsset[i].getType(),portfolioAsset[i].getShares()-benchmarkAsset[j].getShares())); 
          }
          else if(portfolioAsset[i].getShares()<benchmarkAsset[j].getShares()){
            if(transactions==null)
              transactions=new Transaction[1];
            else
              transactions=Arrays.copyOf(transactions,transactions.length+1);
            transactions[transactions.length-1]=new Transaction("BUY",new Asset(portfolioAsset[i].getName(),portfolioAsset[i].getType(),benchmarkAsset[j].getShares()-portfolioAsset[i].getShares()));      ; 
          }
          benchmarkFound[j]=true;
          found=true;
          break;
        }
      }
      if(!found){
        if(transactions==null)
          transactions=new Transaction[1];
        else
          transactions=Arrays.copyOf(transactions,transactions.length+1);
        transactions[transactions.length-1]=new Transaction("SELL",portfolioAsset[i]);
      }
    }
    for(int i=0;i<benchmarkFound.length;i++){
      if(!benchmarkFound[i]){
        if(transactions==null)
          transactions=new Transaction[1];
        else
          transactions=Arrays.copyOf(transactions,transactions.length+1);
        transactions[transactions.length-1]=new Transaction("BUY",benchmarkAsset[i]);
      }
    }
    int min;
    for(int i=0;i<transactions.length;i++){
      min=i;
      for(int j=i+1;j<transactions.length;j++){
        if(transactions[j].getAsset().compareTo(transactions[min].getAsset())<0)
          min=j;
      }
      if(min!=i){
        Transaction temp=transactions[i];
        transactions[i]=transactions[min];
        transactions[min]=temp;
      }
    }
    for(int i=0;i<transactions.length;i++){
      System.out.println(transactions[i]);
    }
  }

}

class Asset implements Comparable<Asset>{
  private String name;
  private String type;
  private int shares;
  
  public Asset(String name, String type,int shares){
    this.name=name;
    this.type=type;
    this.shares=shares;
  }
  public String getName(){
    return name;
  }
  public String getType(){
    return type;
  }
  public int getShares(){
    return shares;
  }
  @Override
  public int compareTo(Asset asset){
    if(name.toLowerCase().compareTo(asset.getName().toLowerCase())<0)
      return -1;
    else if(name.toLowerCase().compareTo(asset.getName().toLowerCase())>0)
      return 1;
    else
      return (type.toLowerCase().compareTo(asset.getType().toLowerCase()));
  }
  
  public String toString(){
    return name+","+type.toLowerCase()+","+shares;
  }
  
}

class Transaction {
  private String type;
  private Asset asset;
  
  public Transaction(String type,Asset asset){
    this.type=type;
    this.asset=asset;
  }
  
  public String getType(){
    return type;
  }
  public Asset getAsset(){
    return asset;
  }
  
  public String toString(){
    return type.toLowerCase()+","+asset.toString();
  }
}







