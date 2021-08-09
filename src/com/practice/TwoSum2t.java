package com.practice;
import java.util.*;
public class TwoSum2t {
	public int[] twoSum(int[] nums, int target) {
		int[] result=new int[2];
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				result[1]=i;
				result[0]=map.get(target-nums[i]);
			}
			map.put(nums[i], i);
		}
		return result;
	}

	public static void main(String[] args) {
		TwoSum2t two=new TwoSum2t();
		int[] nums= {3,2,4,5,7,8,9,0};
		int[] result= two.twoSum(nums, 17);
		System.out.println("Result is::::"+result[0]+","+result[1]);
	}

}
