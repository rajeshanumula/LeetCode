package com.practice;

public class ReverseInteger {
	public int reverse(int x) {
		if(Integer.MIN_VALUE==x) return Integer.MIN_VALUE;
		int sign=1;
		if(x<0) sign=-1;
		x*=sign;
		int max=Integer.MAX_VALUE;
		int rev=0;
		while(x>0) {
			int rem=x%10;
			if(rev==max/10) {
				if(rem>=7 && sign>0) return 0;
			}
			else if(rev>max/10) {
				if(sign<0) return 0;
			}
			rev=rev*10+rem;
			x/=10;
		}
		return rev*sign;
	}

	public static void main(String[] args) {
		ReverseInteger rev=new ReverseInteger();
		int k=rev.reverse(2147483640);
		System.out.println(k);
	}

}
