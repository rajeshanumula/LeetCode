package com.practice;

public class DecodeWays2t {
	 public int numDecodings(String s) {
		 int[] dp=new int[s.length()+1];
		 dp[0]=1;
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)-'0'>0) dp[i+1]=dp[i];
			 if(i-1>=0 && s.charAt(i-1)!='0' && Integer.valueOf(s.substring(i-1,i+1))<=26) {
				 dp[i+1]+=dp[i-1];
			 }
		 }
		 return dp[s.length()];
	 }
	public static void main(String[] args) {
		DecodeWays2t dec=new DecodeWays2t();
		dec.numDecodings("22624");
	}

}
