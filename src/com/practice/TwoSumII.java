package com.practice;

import java.util.HashMap;

public class TwoSumII {
	 public int[] twoSum(int[] numbers, int target) {
		 int[] result=new int[2];
		 HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		 int i=0;
		 while(i<numbers.length) {
			 map.put(numbers[i], i+1);
			 i++;
		 }
		 i=0;
		 while(i<numbers.length) {
			 target-=numbers[i];
			 result[0]=map.get(numbers[i]);
			 if(map.containsKey(target)) {
				 result[1]=map.get(target);
				 target=0;
				 return result;
			 }
			 target+=numbers[i];
			 i++;
		 }
	        return result;
	    }
	public static void main(String[] args) {
		TwoSumII two=new TwoSumII();
		int[] numbers= {0,0,3,4};
		int target=0;
		two.twoSum(numbers, target);
	}

}
