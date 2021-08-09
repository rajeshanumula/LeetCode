package com.practice;

public class LongestPalindromicSubstring {
	int maxLen=0;
	int low=0;
	public String longestPalindrome(String s) {
		if(s.length()<=1) return s;
		for(int i=0;i<s.length();i++) {
			helper(s, i, i);
			helper(s, i, i+1);
		}
		return s.substring(low,low+maxLen);
	}
	public void helper(String s, int left,int right) {
		while(left>=0 && right<s.length() && s.charAt(right)==s.charAt(left)) {
			left-=1;
			right+=1;
		}
		if(maxLen<right-left-1) {
			maxLen=right-left-1;
			low=left+1;
		}
	}

	public static void main(String[] args) {
		LongestPalindromicSubstring lon=new LongestPalindromicSubstring();
		lon.longestPalindrome("ababacd");
	}

}
