package com.practice;

public class ClimbingStairs {
	// Top Down
	int[] com = new int[50];

	public int climbStairs(int n) {
		if (n == 0)
			return 0;
		else if (n == 1) {
			com[1] = 1;
			return 1;
		} else if (n == 2) {
			com[2] = 2;
			return 2;
		} else if (com[n] != 0) {
			return com[n];
		} else {
			com[n] = climbStairs(n - 1) + climbStairs(n - 2);
		}
		return com[n];
	}

	// Bottom Up
	public int climbStairs1(int n) {
		int[] com = new int[n + 1];
		if (n == 0)
			return 0;
		else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}
		com[1] = 1;
		com[2] = 2;
		for (int i = 3; i <= n; i++) {
			com[i] = com[i - 1] + com[i - 2];
		}
		return com[n];
	}

	public static void main(String[] args) {
		int n = 6;
		ClimbingStairs stairs = new ClimbingStairs();
		stairs.climbStairs(n);
	}
}
