package com.practice;
import java.util.*;

public class ContainsDuplicate2t {
	public boolean containsDuplicate(int[] nums) {
		if(nums.length==1) return false;
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) return true;
			else set.add(nums[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicate2t con=new ContainsDuplicate2t();
		int[] nums= {1,2,3,4};
		con.containsDuplicate(nums);
	}

}
