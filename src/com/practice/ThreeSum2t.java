package com.practice;
import java.util.*;
public class ThreeSum2t {
	List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(i>0 && nums[i]==nums[i-1]) continue;
			int j=i+1,k=nums.length-1;
			while(j<k) {
				 if(j>i+1 && nums[j]==nums[j-1]) j++;
				 else if(k<nums.length-1 && nums[k]==nums[k+1]) k--;
				 else if(nums[i]+nums[j]+nums[k]==0) {
					result.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k])));
					j++;
				}
				else if(nums[i]+nums[j]+nums[k]<0) j++;
				else k--;
			}
		}
		return result;
	}
	public void helper(int position, int[] nums, int count,int sum,List<Integer> list) {
		if(count==3 && sum==0) result.add(new ArrayList<Integer>(list));
		if(count!=3) {
			for(int i=position;i<nums.length;i++) {
				if(i>position && nums[i]==nums[i-1]) continue;
				list.add(nums[i]);
				helper(i+1, nums, count+1, sum+nums[i], list);
				list.remove(list.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		ThreeSum2t t=new ThreeSum2t();
		int[] nums= {-1,0,1,2,-1,-4};
		t.threeSum(nums);
	}

}
