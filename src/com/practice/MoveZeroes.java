package com.practice;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int i = 1, j = 0;
		for (; i < nums.length; i++) {
			while (j < nums.length && nums[j] != 0)
				j++;
			while (i < nums.length && nums[i] == 0)
				i++;
			if (j<i && i< nums.length && j < nums.length) {
				nums[j] = nums[i];
				nums[i] = 0;
			}
		}
	}

	public static void main(String[] args) {
		MoveZeroes mov = new MoveZeroes();
		int[] nums = {0,1,0,3,12,0,1,2,0,0,0,0,0,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,0,0,9,8,7,6,5,4,3,2,1,0,0,0,0};
		mov.moveZeroes(nums);
	}

}
