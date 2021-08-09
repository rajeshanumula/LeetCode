package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.LinkedList;

public class Rough2 {
	public void mapCheck() {
		HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
		map.put(1, new ArrayList<Integer>(Arrays.asList(1,1)));
		map.put(2, new ArrayList<Integer>(Arrays.asList(2,2)));
		map.get(2).add(2);
		map.get(2).add(3);
		
		
		HashMap<Integer, LinkedList<Integer>> map3=new HashMap<>();
		map3.put(1, new LinkedList<Integer>(Arrays.asList(1,1)));
		map3.put(2, new LinkedList<Integer>(Arrays.asList(2,2)));
		map3.get(2).add(2);
		map3.get(2).add(3);
		
		HashMap<Integer, Integer> map2=new HashMap<Integer, Integer>();
		map2.put(3, 300);
		map2.put(4, 400);
		int te=map2.get(3)+100;
	}
	public void myGS2() {
		
			
			String[][] students= {{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}};
			int high=Integer.MIN_VALUE;
			Map<String,Integer> sum = new HashMap<String,Integer>();
			Map<String,Integer> count = new HashMap<String,Integer>();
			
			for(String[] student:students) {
				int avg=0;
				if(count.containsKey(student[0])) {
					
					int currCount=count.get(student[0]);
					currCount++;
					count.put(student[0], currCount);
					
					int currSum=sum.get(student[0]);
					currSum+=Integer.valueOf(student[1]);
					sum.put(student[0], currSum);
					
					avg=currSum/currCount;
				}else {
					count.put(student[0], 1);
					sum.put(student[0], Integer.valueOf(student[1]));
					avg=Integer.valueOf(student[1]);
					
				}
				high=Math.max(high, avg);
			}
			
			System.out.println(high);

		
	}
	public static void main(String[] args) {
		Rough2 r=new Rough2();
		r.mapCheck();
	}

}
