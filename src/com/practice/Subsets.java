package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> subsets(int[] nums) {
		result.add(new ArrayList<Integer>());
		for (int i = 1; i <=nums.length; i++) {
			List<Integer> list=new ArrayList<Integer>();
			helper(nums, i, 0,i,list);
		}
		return result;
	}

	public void helper(int[] nums, int len, int start, int rem,List<Integer> list) {
		if(rem==0) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = start; i < nums.length; i++) {
			list.add(nums[i]);
			helper(nums, len, i+1, rem-1, list);
			list.remove(list.size()-1);
		}
	}

	public static void main(String[] args) {
		int[] nums = {  };
		Subsets s = new Subsets();
		s.subsets(nums);
	}

}
