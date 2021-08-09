package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	List<List<Integer>> result= new ArrayList<List<Integer>>();
	public List<List<Integer>> permute(int[] nums) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			list.add(nums[i]);
		}
		List<Integer> reslist=new ArrayList<Integer>();
		helper(reslist, list);
		return result;
	}
	public void helper(List<Integer> reslist,List<Integer> mainlist) {
		if(mainlist.isEmpty())	result.add(new ArrayList<Integer>(reslist));
		else {
			for(int i=0;i<mainlist.size();i++) {
				int removed=mainlist.get(i);
				reslist.add(removed);
				mainlist.remove(i);
				helper(reslist, mainlist);
				mainlist.add(i,removed);
				reslist.remove(reslist.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		Permutations per=new Permutations();
		int[] nums= {1};
		per.permute(nums);
	}

}
