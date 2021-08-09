package com.practice;

import java.io.IOException;
public class CashChange {
  public static void main(String[] args) throws IOException {
    try {
        double purchasePrice = 8.75;
        double cash = 50;
        CashChange.calculateChange(purchasePrice, cash);
    } catch (Exception e) {
        System.out.println(e);
    }
  }

  public static void calculateChange(double purchasePrice, double cash) {    
    double[] coins={50,20,10,5,2,1,0.50,0.20,0.10,0.05,0.02,0.01};
    String[] words={"Fifty Pounds","Twenty Pounds","Ten Pounds","Five Pounds","Two Pounds","One Pound",
                   "Fifty Pence","Twenty Pence","Ten Pence","Five Pence","Two Pence","One Pence"};
    String result="";
    if(purchasePrice==cash) result+="Zero, ";
    else if(purchasePrice>cash) result+="ERROR, ";
    else{
      cash=(cash-purchasePrice)*100;
      int i=0;
      while(cash>0 && i<=11){
        if(cash>=coins[i]*100){
          result+=words[i]+", ";
          cash-=coins[i]*100;
        }
        else i++;
      }
    }
    System.out.println(result.substring(0,result.length()-2));
  }

}