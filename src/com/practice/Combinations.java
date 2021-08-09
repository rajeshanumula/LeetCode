package com.practice;
import java.util.*;
public class Combinations {
	List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> combine(int n, int k) {
		if(k==0 || n==0) return result;
		LinkedList<Integer> list=new LinkedList<Integer>();
		helper(n, k, list);
		return result;
	}
	public void helper(int n,int k,LinkedList<Integer> list) {
		if(k==0) {
			result.add(new LinkedList<Integer>(list));
			return;
		}
		for(int i=n;i>0;i--) {
			list.add(0,i);
			helper(i-1, k-1, list);
			list.poll();
		}
	}

	public static void main(String[] args) {
		Combinations com=new Combinations();
		com.combine(5, 5);
	}

}
