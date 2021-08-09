package com.practice;

public class SearchRotatedSortedArray2t {
	public int search(int[] nums, int target) {
		int low=0;
		int high=nums.length-1;
		int result=helper(nums, target, low, high);
		return result;
	}
	public int helper(int[] nums,int target,int low,int high) {
		int result=-1;
		if(low==high && nums[low]!=target) return -1;
		int mid=(low+high)/2;
		if(nums[mid]==target) return mid;
		else if(target<=nums[mid-1] && target>=nums[low]) {
			high=mid-1;
			result=helper(nums, target, low, high);
		}
		else if(target>=nums[mid+1] && target<=nums[high]) {
			low=mid+1;
			result= helper(nums, target, low, high);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums= {1};
		int target=0;
		SearchRotatedSortedArray2t se=new SearchRotatedSortedArray2t();
		se.search(nums, target);
	}

}
