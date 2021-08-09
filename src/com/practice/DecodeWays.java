package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecodeWays {
	 public int numDecodings(String s) {
	        //dp[i] num of decodings with length i
	        int[] dp = new int[s.length() + 1];
	        dp[0] = 1;
	        for (int i = 0; i<s.length(); i++) {
	            if (s.charAt(i) - '0' > 0) {
	                dp[i+1] += dp[i];
	            }
	            if (i-1 >= 0 && s.charAt(i-1) != '0' && Integer.parseInt(s.substring(i-1, i+1)) <= 26) {
	                dp[i+1] += dp[i-1];    
	            }
	            
	        }
	        
	        return dp[s.length()];
	    }

	public static void main(String[] args) throws IOException  {
		DecodeWays dec=new DecodeWays();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		dec.numDecodings(s);
	}

}
