package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		if(nums.length<3) return result;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(i>0 && nums[i]==nums[i-1]) continue;
			int j=i+1,k=nums.length-1;
			while(j<k) {
				if(j>i+1 && nums[j]==nums[j-1]) j++;
				else if(k<nums.length-1 && nums[k]==nums[k+1]) k--;
				else if(j<k && nums[j]+nums[k]+nums[i]>0) k--;
				else if(j<k && nums[j]+nums[k]+nums[i]<0) j++;
				else if(j<k && nums[j]+nums[k]+nums[i]==0){
					result.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					k--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ThreeSum sum=new ThreeSum();
		int[] nums= {0,0,0};
		sum.threeSum(nums);
	}

}
