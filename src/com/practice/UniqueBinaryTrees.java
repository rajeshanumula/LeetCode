package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueBinaryTrees {
	public int numTrees(int n) {
		int[] count=new int[n+1];
		count[0]=0;
		count[1]=1;
		count[2]=2;
		for(int i=1;i<=n;i++) {
			if(i%2!=0)	count[i]=2*count[i-1]+1;
			else count[i]=2*count[i-1];
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(br.readLine());
		UniqueBinaryTrees ub=new UniqueBinaryTrees();
		ub.numTrees(n);
	}

}
