package com.practice;

public class BlackRock2 {
	public void helper(String pattern,String blobs) {
		String[] blobsplit=blobs.split("\\|");
	    int fcount=0;
	    int count=0;
	    String result="";
	     System.out.println(blobsplit[0]);
	    System.out.println(blobsplit.length);
	    for(int i=0;i<blobsplit.length;i++){
	      if(pattern==null || pattern.length()==0) result+="0|";
	      else{
	        int len=pattern.length();
	        int j=0;
	        while(j<=blobsplit[i].length()-len){
	          if(pattern==blobsplit[i].substring(j,len)){
	            count+=1;
	            fcount+=1;
	          }
	          j++;
	        }
	        result+=count+"|";
	        count=0;
	      }
	    }
	    result+=String.valueOf(fcount);
	    System.out.println(result);
	}
	public static void main(String[] args) {
		BlackRock2 ob=new BlackRock2();
		ob.helper("bc","bcbcasds|bcbcasdhfjgbc|bvvbcbd");
	}

}


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//import java.io.*;
//
//public class Main {
//  /**
//   * Iterate through each line of input.
//   */
//  public static void main(String[] args) throws IOException {
//    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//    BufferedReader in = new BufferedReader(reader);
//    String line;
//    while ((line = in.readLine()) != null) {
//      String[] splittedInput = line.split(";");
//      String pattern = splittedInput[0];
//      String blobs = splittedInput[1];
//      Main.doSomething(pattern, blobs);
//    }
//  }
//  
//  public static void doSomething(String pattern, String blobs) {
//    String[] blobsplit=blobs.split("|");
//    int fcount=0;
//    int count=0;
//   // int len=pattern.length();
//    String result="";
//     System.out.println(blobsplit[0]);
//    System.out.println(blobsplit.length);
//    for(int i=0;i<blobsplit.length;i++){
//      if(pattern==null || pattern.length()==0) result+="0|";
//      else{
//        int len=pattern.length();
//        int j=0;
//        while(j<=blobsplit[i].length()-len){
//          if(pattern==blobsplit[i].substring(j,len)){
//            count+=1;
//            fcount+=1;
//          }
//          j++;
//        }
//        result+=count+"|";
//        count=0;
//      }
//    }
//    result+=String.valueOf(fcount);
//    System.out.println(result);
//  }
//}