package com.practice;

public class ReverseInteger2t {
	public int reverse(int x) {
		int sign=1;
		if(x<0) sign=-1;
		x=x*sign;
		int result=0;
		int tempresult=0;
		while(x>0) {
			int rem=x%10;
			result=result*10+rem;
			if(result%10!=rem || result/10!=tempresult) return 0;
			tempresult=result;
			x/=10;
		}
		return result*sign;
	}

	public static void main(String[] args) {
		ReverseInteger2t rev=new ReverseInteger2t();
		int x=rev.reverse(0);
		System.out.println(x);
	}

}
