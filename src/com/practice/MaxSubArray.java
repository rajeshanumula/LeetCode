package com.practice;

public class MaxSubArray {
	public int[] SubArray(int[] arr, int l, int h) {
		int[] result = new int[3];
		if (l == h) {
			result[0] = l;
			result[1] = h;
			result[2] = arr[h];
			return result;
		}
		int mid = (l + h) / 2;
		int[] leftArray = SubArray(arr, l, mid);
		int[] rightArray = SubArray(arr, mid + 1, h);
		int[] crossArray = crossArray(arr, mid, l, h);
		if(leftArray[2]>=rightArray[2] && leftArray[2]>=crossArray[2])	return leftArray;
		else if(rightArray[2]>=leftArray[2] && rightArray[2]>=crossArray[2])	return rightArray;
		else return crossArray;
	}

	public int[] crossArray(int[] arr, int mid, int l, int h) {
		int sum = 0;
		int leftsum = Integer.MIN_VALUE;
		int rightsum = Integer.MIN_VALUE;
		int leftindex=l;
		int rightindex=h;
		for (int i = mid; i >= l; i--) {
			sum+=arr[i];
			if(sum>leftsum) {
				leftsum=sum;
				leftindex=i;
			}
		}
		sum = 0;
		for (int i = mid+1; i <= h; i++) {
			sum+=arr[i];
			if(sum>rightsum) {
				rightsum=sum;
				rightindex=i;
			}
		}
		int[] cross= {leftindex,rightindex,leftsum+rightsum};
		return cross;
	}

	public static void main(String[] args) {
		MaxSubArray max = new MaxSubArray();
		int[] arr = { -100000,1,2 };
		int h=arr.length-1;
		max.SubArray(arr,0,h);
	}

}
