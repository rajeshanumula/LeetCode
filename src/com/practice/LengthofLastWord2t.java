package com.practice;

public class LengthofLastWord2t {
	public int lengthOfLastWord1(String s) {
		String[] arr=s.split(" ");
		if(arr.length==0) return 0;
		return arr[arr.length-1].length();
	}
	
	public int lengthOfLastWord(String s) {
		int x=s.trim().length();
		int y=s.trim().lastIndexOf(" ")-1;
		return x-y;
	}

	public static void main(String[] args) {
		LengthofLastWord2t len=new LengthofLastWord2t();
		String s=" ";
		int k=len.lengthOfLastWord(s);
		System.out.println(k);
	}

}
