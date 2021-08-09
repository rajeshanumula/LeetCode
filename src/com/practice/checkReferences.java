package com.practice;

import java.util.*;

public class checkReferences {
	public void checkLists(int[][] nums) {
		HashMap<Integer, List<Integer>> map=new HashMap<>();
		for(int[] num:nums) {
			if(map.containsKey(num[0])) {
				map.get(num[0]).add(num[1]);
			}else {
				List<Integer> list=new LinkedList<>(Arrays.asList(num[1]));
				map.put(num[0], list);
			}
		}
		System.out.println("Checking Arraylist"+map);
	}
	
	
	public void checkNumbers(int[] nums) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int num: nums) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		checkReferences ch=new checkReferences();
		int[][] nums= {{1,2},{1,3},{2,3},{2,4},{3,6}};
		int[] freq= {1,2,3,1,2,3,1,4,5,6,2,2,4,5,6,6,7,8,9,9};
		//ch.checkLists(nums);
		ch.checkNumbers(freq);
	}

}
