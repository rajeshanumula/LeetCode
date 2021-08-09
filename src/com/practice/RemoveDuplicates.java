package com.practice;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int length = nums.length;
		int i = 0;
		int j = 0;

		while (j < length) {
			if (nums[i] == nums[j]) {
				j++;
			} else {
				nums[++i] = nums[j];
				j++;
			}
		}
		return ++i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates rem = new RemoveDuplicates();
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		rem.removeDuplicates(nums);
	}

}
