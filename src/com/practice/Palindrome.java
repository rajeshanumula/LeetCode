package com.practice;

public class Palindrome {
	public boolean isPalindrome(int x) {
		if(x<0) {
			return false;
		}
		else {
			int retval=0;
			int rem=0;
			int div=x;
			while(x>0) {
				rem=x%10;
				x=x/10;
				retval=(retval*10)+rem;
				if(retval%10!=rem) {
					return	false;
				}
			}
			return div==retval?true:false;
		}
	}

	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		int x=1232;
		palindrome.isPalindrome(x);
	}

}
