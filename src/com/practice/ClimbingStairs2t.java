package com.practice;

public class ClimbingStairs2t {
	public int climbStairs(int n) {
		if(n==1||n==0) return n;
		int[] dp=new int[n];
		dp[0]=1;
		dp[1]=2;
		for(int i=2;i<n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n-1];
	}

	public static void main(String[] args) {
		ClimbingStairs2t t=new ClimbingStairs2t();
		t.climbStairs(5);
	}

}
