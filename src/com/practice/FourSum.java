package com.practice;
import java.util.*;
public class FourSum {
	List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(i>0 && nums[i]==nums[i-1]) continue;
			for(int j=i+1;j<nums.length;j++) {
				if(j>i+1 && nums[j]==nums[j-1]) continue;
				int k=j+1;
				int l=nums.length-1;
				while(k<l) {
					int sum=nums[i]+nums[j]+nums[k]+nums[l];
					if(k>j+1 && nums[k]==nums[k-1]) k++;
					else if(l<nums.length-1 && nums[l]==nums[l+1]) l--;
					else if(sum==target) {
						result.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k],nums[l])));
						k++;
					}
					else if(sum<target) k++;
					else l--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FourSum sum=new FourSum();
		int[] nums= {-1,2,2,-5,0,-1,4};
		sum.fourSum(nums, 3);
	}

}
