package com.practice;

public class AddBinary2t {
	public String addBinary(String a, String b) {
		StringBuilder result=new StringBuilder();
		int i=a.length()-1, j=b.length()-1;
		int carry=0;
		while(i>=0 || j>=0) {
			int a1= i<0? 0:a.charAt(i)-'0';
			int b1= j<0? 0:b.charAt(j)-'0';
			result.insert(0, (a1+b1+carry)%2);
			carry=(a1+b1+carry)/2;
			i--;
			j--;
		}
		return carry==1?result.insert(0, '1').toString():result.toString();
	}

	public static void main(String[] args) {
		AddBinary2t add=new AddBinary2t();
		add.addBinary("11", "1");
	}

}
