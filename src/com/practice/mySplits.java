package com.practice;

public class mySplits {
	public void helper(String input) {
		String[] arr=input.split("[-_]");
		for(int i=0;i<arr.length;i++) {
			System.out.println("****"+arr[i]+"****");
		}
	}
	public static void main(String[] args) {
		mySplits ms=new mySplits();
		String input="Rajesh_Anumula-reddy";
		ms.helper(input);
	}

}
