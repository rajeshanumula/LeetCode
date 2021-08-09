package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<Integer> list = new ArrayList<Integer>();
		helper(list, candidates, target, candidates.length - 1);
		return result;
	}

	public void helper(List<Integer> newlist, int[] can, int target, int position) {
		for (; position >= 0; position--) {
			if (can[position] == target) {
				newlist.add(can[position]);
				result.add(new ArrayList<Integer>(newlist));
				newlist.remove(newlist.size()-1);
			} else if (target - can[position] > 0) {
				newlist.add(can[position]);
				helper(newlist, can, target - can[position], position);
				newlist.remove(newlist.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		CombinationSum sum = new CombinationSum();
		int[] can = { 1};
		sum.combinationSum(can, 5);
	}

}
