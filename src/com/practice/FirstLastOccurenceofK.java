package com.practice;

public class FirstLastOccurenceofK {
	public int frequency(int[] arr,int k) {
		int low=0, high=arr.length-1;
		if(k<arr[0] || k>arr[high]) return 0;
		if(k==arr[0] && k==arr[high]) return high+1;
		int result=helper(arr, k, low, high);
		return result;
	}
	public int helper(int[] arr, int k,int low, int high) {
		int result=0;
		int mid=(low+high)/2;
		if(arr[mid]==k) {
			int i=mid;
			while(mid>=0 &&arr[mid]==k) mid--;
			while(i<arr.length && arr[i]==k) i++;
			return i-mid-1;
		}
		else if(low==high) {
			return result;
		}
		else if(k<arr[mid]) result=helper(arr, k, low, mid-1);
		else if(k>arr[mid]) result=helper(arr, k, mid+1, high);
		return result;
	}
	public static void main(String[] args) {
		FirstLastOccurenceofK fir=new FirstLastOccurenceofK();
		int[] arr={6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6};
		int k=fir.frequency(arr,6);
		System.out.println(k);
	}

}
