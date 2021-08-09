package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class LongestSubstring {
	  public int lengthOfLongestSubstring(String s) {
		  HashSet<Character> seen = new HashSet<>();
	        int i = 0, max = 0;

	        for (int j = 0; j < s.length(); j++) {
	            char c = s.charAt(j);

	            while (seen.contains(c)) {
	                seen.remove(s.charAt(i++));
	            }

	            seen.add(c);
	            max = Math.max(max, j - i + 1);
	        }
	        return max;
	    }
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		LongestSubstring ls=new LongestSubstring();
		String string=br.readLine();
		int k=ls.lengthOfLongestSubstring(string);
		System.out.println(k);
	}

}
