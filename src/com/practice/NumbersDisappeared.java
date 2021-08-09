package com.practice;

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int k = nums[i];
			int temp = 0;
			while (nums[k - 1] != temp) {
				temp = nums[k - 1];
				nums[k - 1] = k;
				k = temp;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1)
				result.add(i + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		NumbersDisappeared number = new NumbersDisappeared();
		int[] nums = { 1 };
		number.findDisappearedNumbers(nums);
	}

}
