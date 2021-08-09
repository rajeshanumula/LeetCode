package com.practice;

public class JumpGame2t {
	public boolean canJump(int[] nums) {
		if(nums.length==1) return true;
		int count=1;
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i]<count) count++;
			else count=1;
		}
		if(count==1) return true;
		else return false;
	}

	public static void main(String[] args) {
		JumpGame2t jum=new JumpGame2t();
		int[] nums= {3,2,1,0,4};
		jum.canJump(nums);
	}

}
