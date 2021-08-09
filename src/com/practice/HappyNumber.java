package com.practice;
import java.util.HashSet;

public class HappyNumber {
	public boolean isHappy(int n) {
		HashSet<Integer> set=new HashSet<Integer>();
		int sum=0;
		while(n!=0) {
			sum+=Math.pow(n%10, 2);
			n=n/10;
			if(n==0) {
				if(sum==1) return true;
				else if(set.contains(sum)) return false;
				else {
					set.add(sum);
					n=sum;
					sum=0;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		HappyNumber hap=new HappyNumber();
		hap.isHappy(2);
	}

}
