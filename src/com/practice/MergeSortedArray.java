package com.practice;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int pos=nums1.length-1;
		m--;
		n--;
		while(m>=0 && n>=0 && pos>m) {
			if(nums1[m]<nums2[n]) {
				nums1[pos--]=nums2[n--];
			}
			else nums1[pos--]=nums1[m--];
		}
		while(n>=0) nums1[pos--]=nums2[n--];
	}

	public static void main(String[] args) {
		MergeSortedArray mer=new MergeSortedArray();
		int[] num1= {1,2,3,8,9,12,34,56,57};
		int[] num2= {0};
		mer.merge(num1, 9, num2, 0);
	}

}
