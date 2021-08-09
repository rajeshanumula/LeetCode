package com.practice;


public class ModifiedBinarySearch {
	public int findCount(int[] A, int target) {
		int start=0;
		int end=0;
		return 0;
	}
	public int findFirstIdx(int[] A, int target) {
		int left=0;
		int right=A.length-1;
		int idx=-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(A[mid]==target) idx= mid;
		}
		return 0;
	}
	
	public int findLastIdx() {
		return 0;
	}
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7,8,8,8,8,8,8,8,8,8,8,8,8,19};
		ModifiedBinarySearch b=new ModifiedBinarySearch();
		b.findCount(nums, 8);
	}

}
