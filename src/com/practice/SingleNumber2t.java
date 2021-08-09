package com.practice;
import java.util.*;

public class SingleNumber2t {
	public int singleNumber(int[] nums) {
		if(nums.length==1) return nums[0];
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) set.remove(nums[i]);
			else set.add(nums[i]);
		}
		return (int) set.toArray()[0];
	}
	public int singleNumber1(int[] nums) {
	    int ans =0;
	    
	    int len = nums.length;
	    for(int i=0;i!=len;i++)
	        ans = ans^nums[i];
	    
	    return ans;
	    
	}

	public static void main(String[] args) {
		SingleNumber2t num=new SingleNumber2t();
		int[] nums= {1,2,1,5,2,3,3,4,4};
		num.singleNumber1(nums);
	}

}
