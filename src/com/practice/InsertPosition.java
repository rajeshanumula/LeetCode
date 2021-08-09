package com.practice;

public class InsertPosition {
	public int searchInsert(int[] nums, int target) {
		int h=nums.length;
		if(target<=nums[0]) return 0;
		if(target>nums[h-1]) return h;
		if(target==nums[h-1]) return h-1;
		return find(0, h, nums, target);
	}
	public int find(int l,int h,int[] nums, int target) {
		int mid=(l+h)/2;
		if(target==nums[mid]) {
			return mid;
		}
		if(mid==l) return mid+1;
		if(mid==h) return mid-1;
		else if(target<nums[mid]) {
			mid=find(l, mid, nums, target);
		}
		else if(target>nums[mid]) {
			mid=find(mid+1, h, nums, target);
		}
		return mid;
	}
	public static void main(String[] args) {
		InsertPosition insert=new InsertPosition();
		int[] nums= {1,3,5,6,7,8,9,10,15,20};
		int target=4;
		System.out.println(insert.searchInsert(nums, target));
	}

}
