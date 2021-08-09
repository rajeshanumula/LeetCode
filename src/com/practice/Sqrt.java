package com.practice;

public class Sqrt {
	public double mySqrt(int x) {
	        if (x==0)
	            return 0;
	        int count=0;
	        double i=0;
	        double j=x;
	        double mul=0;
	        double mid=(i+j)/2;
	        while(Math.abs(mul-x)>=0.0001) {
	        	mid=(i+j)/2;
	        	mul=mid*mid;
	        	if(mul==x) {
	        		System.out.println(count);
	        		return mid;
	        	}
	        	else if(mul<x) i=mid;
	        	else if(mul>x) j=mid;
	        	count++;
	        }
	        System.out.println(count);
	        return mid;
	    }
	public static void main(String[] args) {
		Sqrt sqrt=new Sqrt();
		int x=1000000;
		double res=sqrt.mySqrt(x);
		System.out.println(res);
	}

}
