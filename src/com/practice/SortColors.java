package com.practice;

public class SortColors {
	public void sortColors(int[] nums) {
		int color=0;
		for(int i=0;i<nums.length;) {
			if(nums[i]==color) {
				i++;
				continue;
			}
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==color) continue;
				if(nums[j]==color) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					if(++i<nums.length) continue;
				}
			}
			color++;
		}
	}

	public static void main(String[] args) {
		int[] nums = {2,1,0,2,1,2,0,2,1,1,1};
		SortColors cs=new SortColors();
		cs.sortColors(nums);
	}

}
