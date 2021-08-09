package com.practice;

public class RemoveElement2t {
	public static int removeElement(int[] nums, int val) {
		int i=0;
		int j=nums.length-1;
		while(i<j) {
			if(nums[j]==val) {
				j--;
				continue;
			}
			if(nums[i]==val) {
				nums[i]=nums[j];
				j--;
			}
			i++;
		}
		return i;
	}

	public static void main(String[] args) {
		int[] nums= {3};
		removeElement(nums, 3);
	}

}
