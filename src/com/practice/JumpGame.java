package com.practice;

public class JumpGame {
    public boolean canJump(int[] nums) {
    	if(nums.length<=1)	return true;
    	int gap=1;
    	for(int i=nums.length-1;i>0;i--) {
    		if(nums[i-1]<gap) {
    			gap+=1;
    		}
    		else if(nums[i-1]>=gap) {
    			gap=1;
    			if(i==1) return true;
    		}
    	}
        return false;
    }
	public static void main(String[] args) {
		JumpGame jg=new JumpGame();
		int[] nums= {4,3,4,5,2,3,2,1,11,1,1,1,1,1,1,1,1,1,1,10,0,0,0,0,0,0,0,0,0,0,0,0,1};
		jg.canJump(nums);
	}

}
