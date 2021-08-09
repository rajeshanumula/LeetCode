package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(candidates);
		helper(candidates, target, list, 0);
		return result;
	}

	void helper(int[] candidates, int target, List<Integer> list, int cur) {
		if (target == 0) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		if (target < 0)
			return;
		for (int i = cur; i < candidates.length; i++) {
			if (candidates[i] <= target) {
				if (i > cur && candidates[i] == candidates[i-1]) continue;
				list.add(candidates[i]);
				helper(candidates, target - candidates[i], list, i + 1);
				list.remove(list.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		CombinationSumII cs = new CombinationSumII();
		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		cs.combinationSum2(candidates, 8);
	}

}
