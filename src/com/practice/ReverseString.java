package com.practice;

public class ReverseString {
	public void reverseString(char[] s) {
		for(int i=0,j=s.length-1;i<j;i++,j--) {
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
		}
		System.out.println(String.valueOf(s));
	}

	public static void main(String[] args) {
		ReverseString rev=new ReverseString();
		char[] arr= {'h','e','l','l','o','R'};
		rev.reverseString(arr);
	}

}
