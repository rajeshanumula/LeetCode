package com.practice;

public class DuplicateNumber {
	public int findDuplicate(int[] nums) {
		int[] arr=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			if(arr[nums[i]]!=0) return nums[i];
			arr[nums[i]]=nums[i];
		}
		return 0;
	}

	public static void main(String[] args) {
		DuplicateNumber dup=new DuplicateNumber();
		int[] nums= {1,2,3,4,5,6,7,8,9,10,11,12,5};
		dup.findDuplicate(nums);
	}

}
