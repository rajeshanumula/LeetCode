package com.practice;

public class ContainerWithMostWater2t {
	public int maxArea(int[] height) {
		int result=0;
		int i=0,j=height.length-1;
		while(i<j) {
			result=Math.max(Math.min(height[i],height[j])*(j-i), result);
			if(height[i]<=height[j]) i++;
			else if(height[j]<height[i]) j--;
		}
		return result;
	}

	public static void main(String[] args) {
		ContainerWithMostWater2t con = new ContainerWithMostWater2t();
		int[] nums = { 4,3,2,1,4 };
		con.maxArea(nums);
	}

}
