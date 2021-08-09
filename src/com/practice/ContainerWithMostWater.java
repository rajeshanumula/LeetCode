package com.practice;


public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int i=0;
		int j=height.length-1;
		int max=0;
		for(;i<j;) {
			int curmax=Math.min(height[i], height[j])*(j-i);
			max=Math.max(max, curmax);
			if(height[i]>height[j]) {
				j--;
			}
			else i++;
		}
		return max;
	}

	public static void main(String[] args){
		ContainerWithMostWater con=new ContainerWithMostWater();
		int[] height= {4,3,2,1,4};
		con.maxArea(height);
	}

}
