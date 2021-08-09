package com.practice;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int cur=nums[i];
			if(cur<0) cur=Math.abs(cur)-1;
			if(cur<nums.length) nums[cur]=-1*nums[cur]-1;
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=0) return i;
		}
		return nums.length;
	}

	public static void main(String[] args) {
		MissingNumber mis=new MissingNumber();
		int [] nums= {2,0};
		mis.missingNumber(nums);
	}

}
