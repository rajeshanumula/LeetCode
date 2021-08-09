package com.practice;

import java.util.*;
public class Ebay2 {
	public int helper(int[] nums, int k) {
		Arrays.sort(nums);
		List<Integer> list=new ArrayList<Integer>();
		return helper2(nums, k, 0, 0, list);
	}
	public int helper2(int[] nums, int k, int cur, int count, List<Integer> list) {
		int sum=count;
		if(list.size()>=k) {
			 return count+1;
		}
		for(int i=cur;i<nums.length;i++) {
			if(i>0 && nums[i]!=nums[i-1]) {
				list.add(nums[i]);
				sum=helper2(nums, k,i+1,count,list);
				list.remove(list.size()-1);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Ebay2 b=new Ebay2();
		int[] nums= {1,2,3,4,1};
		b.helper(nums, 3);
	}

}
