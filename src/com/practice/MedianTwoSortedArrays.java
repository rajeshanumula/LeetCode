package com.practice;

public class MedianTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int sum = nums1.length + nums2.length;
		int count = 0;
		if (sum % 2 == 0) {
			count = 2;
			sum /= 2;
			sum -= 1;
		} else {
			count = 1;
			sum /= 2;
		}
		int div=count;
		int result = 0;
		int count2 = 0;
		int i = 0, j = 0;
		while (count2 < sum && (i < nums1.length || j < nums2.length)) {
			int temp1 = i >= nums1.length ? Integer.MAX_VALUE : nums1[i];
			int temp2 = j >= nums2.length ? Integer.MAX_VALUE : nums2[j];
			if (temp1 < temp2)
				i++;
			else
				j++;
			count2++;
		}
		while (count > 0) {
			int temp1 = i >= nums1.length ? Integer.MAX_VALUE : nums1[i];
			int temp2 = j >= nums2.length ? Integer.MAX_VALUE : nums2[j];
			if (temp1 < temp2) result += nums1[i++]; 
			else result += nums2[j++];
			count--;
		}
		return ((double)result/div);
	}

	public static void main(String[] args) {
		MedianTwoSortedArrays med = new MedianTwoSortedArrays();
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		med.findMedianSortedArrays(nums1, nums2);
	}

}
