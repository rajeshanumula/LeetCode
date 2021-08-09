package com.practice;

public class PlusOne2t {
	public int[] plusOne(int[] digits) {
		int i=digits.length-1;
		while(i>=0) {
			if(digits[i]!=9) {
				digits[i]+=1;
				return digits;
			}
			else {
				digits[i]=0;
				i--;
			}
		}
		int[] nums=new int[digits.length+1];
		nums[0]=1;
		return nums;
	}

	public static void main(String[] args) {
		PlusOne2t pl=new PlusOne2t();
		int[] digits= {9,9,9,9,9,9};
		pl.plusOne(digits);
	}

}
