package com.practice;

import java.util.*;

public class TSYS_1 {
	public List<Integer> helper3(List<String> names,List<String> queries) {
		List<Integer> res=new ArrayList<Integer>();
		for(String query : queries) {
			int count=0;
			for(String name: names) {
				if(name.indexOf(query)==0 && name.length()!=query.length()) count++;
			}
			res.add(count);
		}
		return res;
	}
	public static void main(String[] args) {
		TSYS_1 ts=new TSYS_1();
		List<String> names=new ArrayList<String>(Arrays.asList("raj","rajesh","reddy"));
		List<String> queries=new ArrayList<String>(Arrays.asList("raj","red"));
		ts.helper3(names, queries);
	}
}
