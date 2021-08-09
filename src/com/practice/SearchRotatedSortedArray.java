package com.practice;

public class SearchRotatedSortedArray {
	public int search(int[] nums, int target) {
		int low=0;
		int high=nums.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(target==nums[mid]) return mid;
			if(nums[low]<=nums[mid]) {
				if(target<nums[mid] && target>=nums[low]) high=mid-1;
				else low=mid+1;
			}
			else if(nums[mid]<=nums[high]) {
				if(target<=nums[high] && target>nums[mid]) low=mid+1;
				else high=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		SearchRotatedSortedArray s=new SearchRotatedSortedArray();
		int[] nums= {4,5,6,7,0,1,2};
		s.search(nums, 0);
	}

}
