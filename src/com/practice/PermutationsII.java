package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class PermutationsII {
	boolean[] visited;
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	public List<List<Integer>> permuteUnique(int[] nums) {
		if (nums.length == 0)
			return result;
		Arrays.sort(nums);
		visited = new boolean[nums.length];
		List<Integer> list = new ArrayList<Integer>();
		helper(nums, list, 0);
		return result;
	}

	public void helper(int[] nums, List<Integer> list, int current) {
		if (current == nums.length) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (visited[i])	continue;
			if(i>0 && !visited[i-1] && nums[i-1]==nums[i]) continue;
			visited[i] = true;
			list.add(nums[i]);
			helper(nums, list, current + 1);
			list.remove(list.size() - 1);
			visited[i] = false;
		}
	}

	public static void main(String[] args) {
		PermutationsII pt = new PermutationsII();
		int[] nums = {1,2,3};
		pt.permuteUnique(nums);
	}

}
