package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Permutations2t {
	boolean[] visited;
	List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> permute(int[] nums) {
		if(nums.length==0) return result;
		visited=new boolean[nums.length];
		List<Integer> list=new ArrayList<Integer>();
		helper(nums, list, 0);
		return result;
	}
	public void helper(int[] nums,List<Integer> list,int current) {
		if(current==nums.length) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(visited[i]==true) continue;
			visited[i]=true;
			list.add(nums[i]);
			helper(nums, list, current+1);
			list.remove(list.size()-1);
			visited[i]=false;
		}
	}
	public static void main(String[] args) {
		Permutations2t pt=new Permutations2t();
		int[] nums= {1,2,3};
		pt.permute(nums);
	}

}
