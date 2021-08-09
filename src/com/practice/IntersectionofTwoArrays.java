package com.practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		if(nums1.length==0 || nums2.length==0) return new int[] {};
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		List<Integer> result = new ArrayList<Integer>();
		if(nums1[0]==nums2[0]) result.add(nums1[0]);
		for (int i = 1; i < nums1.length; i++) {
			if (nums1[i] != nums1[i - 1]) {
				for (int j = 0; j < nums2.length; j++) {
						if(nums1[i]==nums2[j])
						{
							result.add(nums1[i]);
							break;
						}
				}
			}
		}
		int[] res=new int[result.size()];
		for(int i=0;i<result.size();i++) res[i]=result.get(i);
		return res;
	}

	public static void main(String[] args) {
		IntersectionofTwoArrays is=new IntersectionofTwoArrays();
		int[] nums1= {4,9,5};
		int[] nums2= {9,4,9,8,4};
		is.intersection(nums1, nums2);
	}

}
