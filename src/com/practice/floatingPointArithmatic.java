package com.practice;

public class floatingPointArithmatic {
	public static void operate() {
		double num=1.5;
		double sum=1;
		for(int i=1;i<10;i++) {
			sum*=num;
			System.out.println(sum);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operate();
	}

}
