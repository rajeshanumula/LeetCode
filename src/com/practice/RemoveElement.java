package com.practice;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int len=nums.length;
		int i=0,j=0;
		while(j<len) {
			if(nums[j]!=val) {
				nums[i]=nums[j];
				i++;
			}
			j++;
		}
		return i;
	}

	public static void main(String[] args) {
		RemoveElement rem=new RemoveElement();
		int[] nums= {3,2,2,3};
		int val=3;
		rem.removeElement(nums, val);
	}

}
