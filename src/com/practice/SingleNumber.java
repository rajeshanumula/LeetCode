package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SingleNumber {
//	public int singleNumber(int[] nums) {
//		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
//		for(int i=0;i<nums.length;i++) {
//			if(map.containsKey(nums[i])){
//				map.put(nums[i], map.get(nums[i])+1);
//			}
//			else {
//				map.put(nums[i], 1);
//			}
//		}
//		for(Map.Entry<Integer, Integer> mapEntry:map.entrySet()) {
//			if(mapEntry.getValue()==1)	return mapEntry.getKey();
//		}
//		return 0;
//	}
	public int singleNumber(int[] nums) {
		HashSet<Integer> h = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!h.contains(nums[i])) {
				h.add(nums[i]);
			} else {
				h.remove(nums[i]);
			}
		}
		for (Integer i : h) {
			return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		SingleNumber single = new SingleNumber();
		int[] arr = { 4, 1, 2, 1, 2 };
		single.singleNumber(arr);
		
	}

}
