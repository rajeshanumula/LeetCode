package com.practice;

public class Numberof1Bits {
	public int hammingWeight(int n) {
		int count=0;
		while(n!=0) {
			count+=((n%2)&1);
			n>>>=1;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberof1Bits num=new Numberof1Bits();
		int n=00000000000000000000000000001011;
		num.hammingWeight(n);
	}

}
