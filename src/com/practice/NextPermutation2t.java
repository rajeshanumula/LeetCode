package com.practice;

public class NextPermutation2t {
	public void nextPermutation(int[] nums) {
		int increase=-1;
		int i=nums.length-1;
		while(i<nums.length) {
			if(i>0 && increase<0 && nums[i]<=nums[i-1]) {
				i+=increase;
			}
			else if(i>0 && increase<0 && nums[i]>nums[i-1]) {
				int temp=nums[i-1];
				nums[i-1]=nums[i];
				nums[i]=temp;
				increase=1;
			}
			if(i<nums.length-1 && increase>0 && nums[i]>nums[i+1]) {
				int temp=nums[i+1];
				nums[i+1]=nums[i];
				nums[i]=temp;
				i+=increase;
				if(i==nums.length-1) {
					increase=-1;
					i+=increase;
				}
			}
			else if(i<nums.length-1 && increase>0 && nums[i]<=nums[i+1]) {
				i+=increase;
			}
		}
		System.out.println(nums.toString());
	}

	public static void main(String[] args) {
		NextPermutation2t next=new NextPermutation2t();
		int[] nums= {1,2,5,4,3,2};
		next.nextPermutation(nums);
	}

}
