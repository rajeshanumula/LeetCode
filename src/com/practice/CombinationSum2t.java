package com.practice;
import java.util.*;

public class CombinationSum2t {
	int temp=Integer.MIN_VALUE;
	List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		if(candidates.length==0) return result;
		Arrays.sort(candidates);
		List<Integer> list=new ArrayList<Integer>();
		helper(candidates.length-1,candidates, target, list);
		return result;
	}
	public void helper(Integer cur,int[] candidates,int target,List<Integer> list) {
		if(target==0) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		else if(target<0) return;
		else {
			for(int i=cur;i>=0;i--) {
				if(temp==candidates[i]) continue;
				list.add(candidates[i]);
				helper(i,candidates, target-candidates[i], list);
				list.remove(list.size()-1);
				temp=candidates[i];
			}
		}
	}

	public static void main(String[] args) {
		CombinationSum2t sum=new CombinationSum2t();
		int[] candidates= {2,3,3,6,7};
		int target=7;
		sum.combinationSum(candidates, target);
	}

}
