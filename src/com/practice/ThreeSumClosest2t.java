package com.practice;
import java.util.*;
public class ThreeSumClosest2t {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int min=nums[0]+nums[1]+nums[nums.length-1];
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			int j=i+1,k=nums.length-1;
			while(j<k) {
				sum=nums[i]+nums[j]+nums[k];
				if(sum<=target) j++;
				else k--;
				if(Math.abs(sum-target)<Math.abs(min-target)) min=sum;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		ThreeSumClosest2t thr=new ThreeSumClosest2t();
		int[] nums= {1,2,4,8,16,32,64,128};
		int target=82;
		thr.threeSumClosest(nums, target);
	}

}
