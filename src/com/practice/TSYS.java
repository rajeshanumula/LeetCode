package com.practice;

import java.util.*;

public class TSYS {
	public void findCoins(List<Long> coins) {
		List<Long> dup=new ArrayList<Long>();
		dup.addAll(coins);
		Collections.sort(coins);
		List<Long> stagesList=new ArrayList<Long>();
		stagesList.add((long)0);
		long max=coins.get(coins.size()-1);
		long totalCoins=1;
		long i=2;
		boolean last=false;
		while(totalCoins<=max || last) {
			stagesList.add(totalCoins);
			System.out.print(totalCoins+",");
			totalCoins+=i++;
			if(totalCoins>=max) last=!last;
			
		}
		System.out.println();
		for(long coin: dup) {
			System.out.println(findPos(coin, stagesList));
		}
	}
	
	public long findPos(long coin, List<Long> stages) {
		long left=0;
		long right=stages.size()-1;
		while(left<=right) {
			long mid=(left+right)/2;
			if(coin==stages.get((int)mid)) return mid;
			else if(coin<stages.get((int)mid)) right=mid-1;
			else left=mid+1;
		}
		return left-1;
	}
	public static void main(String[] args) {
		TSYS ts=new TSYS();
		List<Long> input=new ArrayList<Long>();
		input.add((long) 100);
		input.add((long) 340);
		input.add((long) 89);
		input.add((long) 2);
		input.add((long) 56);
		ts.findCoins(input);
	}

}
