package com.practice;

import java.util.HashMap;
import java.util.List;

public class SahithYext {
	public void helper(List<Integer> input) {
		if(input.size()<2) return ;
		int first=input.get(0);
		int second=input.get(1);
		if(first<second) {
			int temp=first;
			first=second;
			second=temp;
		}
		for(int i=2;i<input.size();i++) {
			int cur=input.get(i);
			if(first<cur) {
				second=first;
				first=second;
			}else if(second<cur) {
				second=cur;
			}
		}
		
		
	}
	
	public void helper2(List<Integer> input) {
		
	}
	public static void main(String[] args) {

	}

}
