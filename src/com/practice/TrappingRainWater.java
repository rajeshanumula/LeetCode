package com.practice;

public class TrappingRainWater {
	public int trap(int[] height) {
		if(height.length<=2) return 0;
		int water=0;
		int i=0,j=height.length-1;
		int leftMax=0, rightMax=0;
		while(i<j) {
			if(height[i]<height[j]) {
				if(leftMax<height[i]) leftMax=height[i++];
				else water+=leftMax-height[i++];
			}
			else {
				if(rightMax<height[j]) rightMax=height[j--];
				else water +=rightMax-height[j--];
			}
		}
		return water;
	}

	public static void main(String[] args) {
		TrappingRainWater rain=new TrappingRainWater();
		int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
		rain.trap(height);
	}

}
