package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		int min = Integer.MAX_VALUE;
		Arrays.sort(arr);
		List<List<Integer>> addList = new ArrayList<List<Integer>>();
		for (int i = 1; i < arr.length; i++) {
			int diff = arr[i] - arr[i - 1];
			if (min == diff) {
				addList.add(Arrays.asList(arr[i - 1], arr[i]));
			}
			else if(diff<min) {
				addList.clear();
				addList.add(Arrays.asList(arr[i - 1], arr[i]));
				min=diff;
			}
		}
		return addList;
	}

	public static void main(String[] args) {
		MinimumAbsoluteDifference min = new MinimumAbsoluteDifference();
		int[] arr = { 1, 3, 5, 10,11, 15,16 };
		min.minimumAbsDifference(arr);
	}

}
