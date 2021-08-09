package com.practice;

import java.util.Arrays;

public class MySorting {
	public static void stringHelper(String[][] arr) {
		//Sorting 2D arrays
		Arrays.sort(arr, (a,b)-> b[1].compareTo(a[1]));
	}
	public static void intHelper(int[][] arr) {
		//Sorting 2D arrays
		Arrays.sort(arr, (a,b)-> a[1]-b[1]);
	}
	public static void charHelper() {
		//Sorting 2D arrays
	}
	public static void main(String[] args) {
		String[][] arr= {{"rajesh","reddy"}, {"aajireddy","anumula"},{"sai", "prasad"}};
		int[][] intArr= {{1,4},{5,3},{9,2},{3,6}};
	}

}
