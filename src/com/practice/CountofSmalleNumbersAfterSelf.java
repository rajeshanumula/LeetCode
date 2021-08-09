package com.practice;

import java.util.*;


public class CountofSmalleNumbersAfterSelf {
	int[] indexes;
	Integer[] result;
	public List<Integer> countSmaller(int[] nums) {
		List<Integer> list=new ArrayList<Integer>();
		indexes=new int[nums.length];
		result=new Integer[nums.length];
		for(int i=0;i<nums.length;i++) indexes[i]=i;
		Arrays.fill(result, 0);
		mergeSort(nums, 0,nums.length-1);
		list.addAll(Arrays.asList(result));
		return list;
	}
	public void mergeSort(int[] nums, int l,int h) {
		if(l>=h) return;
		int m=(l+h)/2;
		mergeSort(nums, l, m);
		mergeSort(nums, m+1, h);
		merge(nums, l, m, h);
	}
	public void merge(int[] nums, int l, int m, int h) {
		int[] left=new int[m-l+1];
		int[] right=new int[h-m];
		int[] left_indexes=new int[m-l+1];
		int[] right_indexes=new int[h-m];
		int n=0;
		for(int i=l;i<=m;i++) left[n++]=nums[i];
		n=0;
		for(int i=m+1;i<=h;i++) right[n++]=nums[i];
		n=0;
		for(int i=l;i<=m;i++) left_indexes[n++]=indexes[i];
		n=0;
		for(int i=m+1;i<=h;i++) right_indexes[n++]=indexes[i];
		int i=0;int j=0;
		int low=l;
		while(i<left.length && j<right.length) {
			if(left[i]>right[j]) {
				int z=i;
				while(z<left.length) result[left_indexes[z++]]++;
				result[left_indexes[i]]+=j;
				nums[low]=right[j];
				indexes[low]=right_indexes[j];
				j++;
				low++;
			}
			else {
				//result[left_indexes[i]]+=j;
				nums[low]=left[i];
				indexes[low]=left_indexes[i];
				i++;
				low++;
			}
		}
		while(i<left.length) {
			//result[left_indexes[i]]+=i;
			//indexes[low]=indexes[l+i];
			nums[low]=left[i];
			indexes[low]=left_indexes[i];
			i++;
			low++;
		}
		while(j<right.length) {
			//indexes[low]=indexes[m+1+j];
			nums[low]=right[j];
			indexes[low]=right_indexes[j];
			j++;
			low++;
		}
	}
	
	public static void main(String[] args) {
		CountofSmalleNumbersAfterSelf count=new CountofSmalleNumbersAfterSelf();
		int[] nums= {5,2,6,1};
		count.countSmaller(nums);
	}

}
