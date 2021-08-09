package com.practice;

public class findPosition {
	public int findIdx(int[] arr, int target) {
		int i=0;int j=arr.length-1;
		while(i<=j) {
			int mid=(i+j)/2;
			if(arr[mid]==target) return mid+1;
			else if(arr[mid]>target) j=mid-1;
			else i=mid+1;
		}
		System.out.println(i);
		return i;
	}
	public static void main(String[] args) {
		int[] arr= {1,5};
		int t=5;
		findPosition pos=new findPosition();
		System.out.println(pos.findIdx(arr, t));
	}

}
