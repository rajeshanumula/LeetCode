package com.practice;

public class FindMinimum {
	public int findMin(int[] num) {
		if (num == null || num.length == 0) {
            return 0;
        }
        if (num.length == 1) {
            return num[0];
        }
        int start = 0, end = num.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid > 0 && num[mid] < num[mid - 1]) {
                return num[mid];
            }
            if (num[start] <= num[mid] && num[mid] > num[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return num[start];
	}
	
	public int findMin2(int[] nums) {
		int lo = 0, hi = nums.length-1;
        while (lo < hi) {
            int mid = lo + (hi-lo)/2;
            if (nums[mid] < nums[hi]) {
                hi = mid;
            } else {
                lo = mid+1;
            }
        }
        return nums[lo];
	}
	public static void main(String[] args) {
		int[] nums= {6,7,8,9,1,1,2,3,4,5,5,5,5,5,5,5};
		FindMinimum min=new FindMinimum();
		int result=min.findMin(nums);
		System.out.println(result);
		int result2=min.findMin2(nums);
		System.out.println(result2);
	}

}
