package com.practice;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapImple {
	public void treeMapImpl(int[][] nums) {
		Comparator<Integer> compare=new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				int diff=Integer.compare(i1, i2);
				return diff>0?1:-1;
			}
		};
		TreeMap<Integer, Integer> map=new TreeMap<>(compare);
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i][0], nums[i][1]);
		}
		System.out.println(map);
		System.out.println(map.ceilingEntry(7));
		System.out.println(map.floorEntry(1));
		System.out.println(map.ceilingEntry(6));
		System.out.println(map.floorEntry(6));
	}
	public static void main(String[] args) {
		int[][] nums= {{1,10},{2,20},{4,40},{3,30},{15,150},{6,60},{5,50},{10,100}};
		TreeMapImple a=new TreeMapImple();
		a.treeMapImpl(nums);
	}

}
