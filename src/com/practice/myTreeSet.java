package com.practice;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class myTreeSet {
	public void helper(String[] arr) {
		TreeSet<String> set=new TreeSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(String i: set)
			System.out.println(i);
		System.out.println(set.last());
	}

	public static void main (String[] args) throws IOException{
		myTreeSet set=new myTreeSet();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size");
		int size=Integer.valueOf(br.readLine());
		String[] arr=new String[size];
		for(int i=0;i<size;i++) {
			arr[i]=String.valueOf(br.readLine());
		}
		set.helper(arr);
		
	}

}
