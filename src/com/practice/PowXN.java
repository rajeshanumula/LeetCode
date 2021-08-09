package com.practice;

public class PowXN {
	public double myPow(double x, int n) {
		double sum=x;
		for(int i=1;i<n;i++) {
			sum*=x;
		}
		return sum;
	}

	public static void main(String[] args) {
		PowXN pow=new PowXN();
		pow.myPow(2.00000, 32);
	}

}
