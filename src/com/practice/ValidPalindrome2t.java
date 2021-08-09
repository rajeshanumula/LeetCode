package com.practice;

public class ValidPalindrome2t {
	public boolean isPalindrome(String s) {
		StringBuilder sb=new StringBuilder("");
		for(Character cur:s.toCharArray()) {
			if(Character.isLetterOrDigit(cur)) {
				sb.append(cur);
			}
		}
		return sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase());
	}

	public static void main(String[] args) {
		ValidPalindrome2t val=new ValidPalindrome2t();
		String s="race a car";
		boolean res= val.isPalindrome(s);
		System.out.println(res);
	}

}
