package com.practice;
import java.util.*;
public class PerfectSquares {
	public int numSquares(int n) {
		int[] nums= new int[n+1];
		Arrays.fill(nums, Integer.MAX_VALUE);
		nums[0]=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j*j<=n;j++) {
				if(j*j<=i) 	nums[i]=Math.min(nums[i],nums[i-j*j]+1);
			}
		}
		return nums[n];
	}

	public static void main(String[] args) {
		PerfectSquares ps=new PerfectSquares();
		System.out.println(ps.numSquares(12));
	}

}
