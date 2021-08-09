package com.practice;

import java.util.ArrayList;

public class PowerofTwo {
	public boolean isPowerOfTwo(int n) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int i=0;
		if(n<=0) return false;
		list.add(1);
		int cur=1;
		while(cur<n) {
			cur=2*list.get(i);
			if(cur/2!=list.get(i)) return false;
			i++;
			list.add(cur);
			if(cur==n)	return true;
		}
		return false;
	}

	public static void main(String[] args) {
		PowerofTwo pow=new PowerofTwo();
		pow.isPowerOfTwo(15);
	}

}
