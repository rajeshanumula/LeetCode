package com.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Sreekar1 {
	public int[] findOcc(int[] a, int[] b, int[][] queries) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int num:b) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(int[] query:queries) {
			if(query[0]==0) {
				a[query[1]]+=query[2];
			}else {
				int count=0;
				for(int num:a) {
					int diff=query[1]-num;
					if(map.containsKey(diff)) {
						count+=map.get(diff);
					}
				}
				list.add(count);
			}
		}
		int[] result=new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i]=list.get(i);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a= {2,3};
		int[] b= {1,2,2};
		int[][] queries= {{1,4},{0,0,1},{1,5}};
		Sreekar1 sree1=new Sreekar1();
		sree.findOcc(a, b, queries);
	}

}
