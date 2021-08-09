package com.practice;

import java.util.ArrayList;
import java.util.*;

public class PrampPairswithSpecificDifference {
	static int[][] findPairsWithGivenDifference(int[] arr, int k) {
		ArrayList<Integer[]> list=new ArrayList<Integer[]>();
		
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(k+arr[i])) {
				list.add(new Integer[] {k+arr[i], arr[i]});
			}
			if(set.contains(arr[i]-k)) {
				list.add(new Integer[] { arr[i],arr[i]-k});
			}
			set.add(arr[i]);
		}
		int[][] result=new int[list.size()][2];
		for(int i=0;i<list.size();i++) {
			result[i][0]=(int)list.get(i)[0];
			result[i][1]=(int)list.get(i)[1];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr= {1, 7, 5, 3, 32, 17, 12};
		findPairsWithGivenDifference(arr, 17);
		System.out.println("Done");
	}

}
