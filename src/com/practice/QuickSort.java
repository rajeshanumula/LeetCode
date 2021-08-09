package com.practice;

public class QuickSort {
	public int[] sort(int[] arr,int l,int h) {
		if(l<h) {
			int partition=partition(arr, l, h);
			sort(arr, l, partition);
			sort(arr,partition+1,h);
		}
		return arr;
	}
	public int partition(int[] arr,int l, int h) {
		int pivot= arr[l];
		int i=l,j=h;
		while(i<j) {
			do {
				i++;
			}while(arr[i]<=pivot);
			do{
				j--;
			}while(arr[j]>pivot);
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[j];
		arr[j]=arr[l];
		arr[l]=temp;
		return j;
	}
	public static void main(String[] args) {
		int[] arr= {10,16,8,12,15,6,3,9,5};
		int h=arr.length;
		QuickSort leet=new QuickSort();
		arr= leet.sort(arr,0,h);
		for(int i=0;i<h;i++) {
			System.out.println(arr[i]);
		}
	}

}
