package com.practice;

import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int len=nums.length;
		int val=0;
		int i=0;
		while(i<len) {
			if(map.containsKey(nums[i])) {
				val=map.get(nums[i])+1;
				if(val>(len/2)) {
					return nums[i];
				}
				map.put(nums[i],val);
			}
			else {
				map.put(nums[i], 1);
			}
			i++;
		}
		return nums[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElement major=new MajorityElement();
		int[] nums= {1};
		major.majorityElement(nums);
	}

}
