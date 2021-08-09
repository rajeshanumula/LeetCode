package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOccurrences {
	public boolean uniqueOccurrences(int[] arr) {
		if(arr.length==1) return true;
		Arrays.sort(arr);
		int count=1;
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				if(!set.contains(count)) set.add(count);
				else return false;
				count=1;
			}
			else count+=1;
		}
		if(arr[arr.length-1]==arr[arr.length-2]) {
			if(set.contains(count)) return false;
		}
		else {
			count=1;
			if(set.contains(count)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		UniqueNumberOccurrences num=new UniqueNumberOccurrences();
		int[] arr= {1,1,2,2};
		num.uniqueOccurrences(arr);
	}

}
