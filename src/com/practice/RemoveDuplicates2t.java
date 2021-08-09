package com.practice;

public class RemoveDuplicates2t {
	public static int removeDuplicates(int[] nums) {
		int i=1;
		if(nums.length==1) return 1;
		for(int j=1;j<nums.length;j++) {
			if(nums[j-1]==nums[j]) continue;
			else {
				nums[i++]=nums[j];
			}
		}
		return i;
	}

	public static void main(String[] args) {
		int[] nums= {1,1,2};
		removeDuplicates(nums);
	}

}
