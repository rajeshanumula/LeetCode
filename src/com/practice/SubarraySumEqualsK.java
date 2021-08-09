package com.practice;

public class SubarraySumEqualsK {
	public int subarraySum(int[] nums, int k) {
		int count=0;
		int sum=0;
		int i=0,j=0;
		while(j<nums.length) {
			if(sum+nums[j]==k) {
				count++;
				sum-=nums[i];
				i++;
			}
			else if(sum+nums[j]>k) {
				if(i!=j) {
					sum-=nums[i];
				}
				else j++;
				i++;
			}
			else if(sum+nums[j]<k) {
				sum+=nums[j];
				j++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		SubarraySumEqualsK sum=new SubarraySumEqualsK();
		int[] nums= {1,-6,1,-7,2};
		sum.subarraySum(nums, -5);
	}

}
