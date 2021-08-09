package com.practice;

public class PrampPancakeSort {
	int[] pancakeSort(int[] arr) {
		// your code goes here
		int last = arr.length - 1;
		while (last >= 0) {
			int max = 0;
			for (int i = 1; i <=last; i++) {
				if (arr[i] > arr[max])
					max = i;
			}
			flip(arr, max);
			flip(arr, last);
			last--;
		}
		return arr;
	}

	int[] flip(int[] arr, int k) {
		int mid=k/2;
		for (int i = 0; i <=mid; i++) {
			int temp = arr[i];
			arr[i] = arr[ k - i];
			arr[k - i] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		PrampPancakeSort sort=new PrampPancakeSort();
		int[] nums= {5,6,3,4,2,1,2,2,4,65,7,8,9,9,9};
		sort.pancakeSort(nums);
	}

}
