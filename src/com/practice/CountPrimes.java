package com.practice;

public class CountPrimes {
	public int countPrimes(int n) {
		if(n<3) return 0;
		int count=0;
		boolean[] primes=new boolean[n];
		for(int i=2;i<n;i++) {
			if(!primes[i]) count+=1;
			for(int j=2;i*j<n;j++) {
				primes[i*j-1]=true;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		CountPrimes cp=new CountPrimes();
		cp.countPrimes(100);
	}

}
