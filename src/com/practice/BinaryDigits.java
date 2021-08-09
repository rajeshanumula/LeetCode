package com.practice;

public class BinaryDigits {
	public int helpers(String str) {
		int count=0;
		int i=0;
		while(i<str.length() && str.charAt(i)=='0') i++;
		for(;i<str.length();i++) {
			if(str.charAt(i)=='1' && i!=str.length()-1) count+=2;
			else if((str.charAt(i)=='0' && i!=str.length()-1) || (str.charAt(i)=='1' && i==str.length()-1)) count+=1;
		}
		System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
		BinaryDigits bin=new BinaryDigits();
		bin.helpers("11100");
	}

}
