package com.practice;

import java.io.*;
import java.util.*;


public class myHashMap {
	public static void myMap() throws IOException {
		HashSet<Integer> set=new HashSet<Integer>();
		Integer[] arr= {1,2,3,4,5,6,7,85,8,8,9,10,11,12,13,14,15,16,17,18};
		set.addAll(Arrays.asList(arr));
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.getOrDefault(1, 0);
	}
	public static void main(String[] args) throws IOException{
		myMap();
	}

}
