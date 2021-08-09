package com.practice;

import java.util.*;

public class myLoops {
	public void helper(int[] nums) {
		int i=0;
		for(;i<nums.length;++i) {
			//System.out.println(nums[i]);
		}
		//System.out.println(i);
		Deque<Integer> q=new ArrayDeque<Integer>();
		int[] cop=Arrays.copyOfRange(nums, 2,6);
		for(i=0;i<cop.length;++i) {
			System.out.println(cop[i]);
		}
		int[][] cop1=new int[5][4];
		Arrays.sort(cop1, (a,b)->b[0]-a[0]);
	}
	public static void main(String[] args) {
		myLoops loops=new myLoops();
		int[] nums= {0,1,2,3,4,5,6,7,8,9,10};
		loops.helper(nums);
	}

}
