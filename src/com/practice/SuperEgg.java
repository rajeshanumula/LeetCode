package com.practice;

public class SuperEgg {
	public int superEggDrop(int k, int n) {
        int[][] dp = new int[n + 1][k + 1];
        int M = 0;
        while (dp[M][k] < n) {
            ++M;
            for (int K = 1; K <= k; ++K)
                dp[M][K] = dp[M - 1][K - 1] + dp[M - 1][K] + 1;
        }
        return M;
    }
	public static void main(String[] args) {
		SuperEgg egg=new SuperEgg();
		egg.superEggDrop(4, 14);
	}

}
