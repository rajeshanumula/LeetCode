package com.practice;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		int min=nums[0]+nums[1]+nums[2];
		Arrays.sort(nums);
		int j=0;
		int sum=0;
		for(int i=0;i+2<nums.length;i++) {
			j=i+1;
			int k=nums.length-1;
			while(j<k) {
				sum=nums[i]+nums[j]+nums[k];
				if(sum>target)	k--;
				else j++;
				if(Math.abs(sum-target)<Math.abs(min-target)) {
					min=sum;
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		ThreeSumClosest three=new ThreeSumClosest();
		int[] nums= {-1,2,1,-4};
		three.threeSumClosest(nums, 1);
	}

}
