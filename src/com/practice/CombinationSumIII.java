package com.practice;
import java.util.*;
public class CombinationSumIII {
	List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> combinationSum3(int k, int n) {
		if(n<k) return result;
		List<Integer> list=new ArrayList<Integer>();
		helper(1,k,n,list);
		return result;
	}
	public void helper(int start, int k,int n,List<Integer> list) {
		if(k==0 && n==0) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		else if(k==0) return;
		for(int i=start;i<=9;i++) {
			list.add(i);
			helper(i+1, k-1, n-i, list);
			list.remove(list.size()-1);
		}
	}
	public static void main(String[] args) {
		CombinationSumIII com=new CombinationSumIII();
		com.combinationSum3(3, 2);
	}

}
