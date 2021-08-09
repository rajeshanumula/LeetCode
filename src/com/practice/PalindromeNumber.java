package com.practice;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if(x<0) return false;
		else if(x<10) return true;
		String input=String.valueOf(x);
		String temp="";
		int mid=(input.length()-1)/2;
		int i=0;
		while(i<=mid) {
			temp=input.charAt(i)+temp;
			i++;
		}
		if(input.length()%2==0) {
			if(!temp.equals(input.substring(mid+1))) return false;
			else return true;
		}
		else {
			String temp1=input.substring(mid);
			if(!temp.equals(temp1)) return false;
			else return true;
		}
	}

	public static void main(String[] args) {
		PalindromeNumber pal=new PalindromeNumber();
		boolean res=pal.isPalindrome(11);
		System.out.println(res);
	}

}
