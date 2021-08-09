package com.practice;

public class HouseRobber {
	public int rob(int[] nums) {
		if(nums.length == 0) return 0;
		if(nums.length==1) return nums[0];
		for(int i=1;i<nums.length;i++) {
			if(i-2>0) nums[i]=Math.max(nums[i]+nums[i-2],nums[i]+nums[i-3]);
			else if(i-1>0) nums[i]+=nums[i-2];
		}
		return Math.max(nums[nums.length-1], nums[nums.length-2]);
	}

	public static void main(String[] args) {
		HouseRobber hr=new HouseRobber();
		int[] nums= {2,5};
		hr.rob(nums);
	}

}
