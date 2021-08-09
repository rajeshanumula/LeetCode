package com.practice;

public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
		int[] dp=new int[n+1];
		if(n==1 || n==2) return n;
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<n+1;i++) {
			for(int j=i;j>0;j--) {
				dp[i]+=dp[i-j]*dp[j-1];
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		UniqueBinarySearchTrees un=new UniqueBinarySearchTrees();
		un.numTrees(5);
	}

}
