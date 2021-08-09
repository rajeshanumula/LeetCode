package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		List<Integer> set=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) return true;
			else set.add(nums[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicate dup=new ContainsDuplicate();
		int[] nums= {1,1,1,3,3,4,3,2,4,2};
		dup.containsDuplicate(nums);
	}

}
