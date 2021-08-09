package com.practice;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		int sign=1;
		int result=0;
		
		if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
		else if(divisor==Integer.MIN_VALUE) return 0;
		else if(dividend==Integer.MIN_VALUE) {
			
		}
		
		if(dividend<0 && divisor<0) {
			dividend=dividend-dividend-dividend;
			divisor=divisor-divisor-divisor;
			sign=1;
		}
		else if(dividend<0) {
			dividend-=dividend-dividend-dividend;
			sign=-1;
		}
		else if(divisor<0) {
			divisor=divisor-divisor-divisor;
			sign=-1;
		}
		
		if(divisor==1) {
			if(sign==-1)
				return dividend-dividend-dividend;
			else return dividend;
		}
		
		while(dividend>=divisor) {
			dividend-=divisor;
			result++;
		}
		
		if(sign==-1)
			return result-result-result;
		else return result;
	}

	public static void main(String[] args) {
		DivideTwoIntegers div=new DivideTwoIntegers();
		int k=div.divide(-1, -1);
		System.out.println(k);
	}

}
