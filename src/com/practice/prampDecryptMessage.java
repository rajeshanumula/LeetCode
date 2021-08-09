package com.practice;

public class prampDecryptMessage {
	  static String decrypt(String word) {
	    // your code goes here
	    StringBuilder sb=new StringBuilder(word);
	   int sum=0;
	    for(int i=0;i<word.length();i++){
	      if(i==0){
	        sum+=sb.charAt(i);
	        int dec=sb.charAt(i)-1;
	        if(dec<97) dec+=26;
	        //sb.replace(i, i+1, Character.toString((char)dec));
	        sb.setCharAt(i, (char)dec);
	      }
	      else{
	        int dec=findAscii(sb.charAt(i),sum);
	        //sb.replace(i, i+1, Character.toString((char)dec));
	        sb.setCharAt(i, (char)dec);
	        sum+=dec;
	      }
	    }
	    return sb.toString();
	   }
	  public static int findAscii(int enc,int sum){
	    while(enc-sum<97){
	    	enc=enc+26;
	    }
	    return enc-sum;
	  }
	
	  public static void main(String[] args) {
		  decrypt("yqhhhh");
	  }
}
