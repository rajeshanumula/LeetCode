package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII2t {
	int temp=Integer.MIN_VALUE;
	List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		if(candidates.length==0) return result;
		Arrays.sort(candidates);
		List<Integer> list=new ArrayList<Integer>();
		helper(candidates.length,candidates, target, list);
		return result;
	}
	public void helper(Integer cur,int[] candidates,int target,List<Integer> list) {
		if(target==0) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		else if(target<0) return;
		else {
			for(int i=cur-1;i>=0;i--) {
				if(temp==candidates[i]) continue;				
				list.add(candidates[i]);
				helper(i,candidates, target-candidates[i], list);
				list.remove(list.size()-1);
				temp=candidates[i];
			}
		}
	}

	public static void main(String[] args) {
		CombinationSumII2t sum=new CombinationSumII2t();
		int[] candidates= {10,1,2,7,6,1,5};
		int target=8;
		sum.combinationSum2(candidates, target);
	}

}

