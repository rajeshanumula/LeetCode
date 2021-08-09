package com.practice;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		s=s.toUpperCase();
		int len=s.length();
		int i=0,j=len-1;
		boolean ret=false;
		while(i<=j) {
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
				continue;
			}
			if(!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
				continue;
			}
			if(s.charAt(i)==s.charAt(j)) {
				i++;j--;
			}
			else {
				return ret;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome valid=new ValidPalindrome();
		String s="0P";
		valid.isPalindrome(s);
	}

}
