package com.practice;
import java.util.*;

public class ebay3 {
	public boolean[] helper(int[] nums, String[] words) {
		boolean[] result=new boolean[words.length];
		String[] mywords= {" ", ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		Set<Character> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			char[] arr=mywords[nums[i]].toCharArray();
			for(Character c: arr) {
				set.add(c);
			}
		}
		for(int i=0;i<words.length;i++) {
			char[] arr=words[i].toCharArray ();
			for(int j=0;j<arr.length;j++) {
				if(set.contains(arr[j]) && j==arr.length-1) result[i]=true;
				else if(!set.contains(arr[j])) break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] digits= {2,3};
		String[] words= {"abc","gdef"};
		ebay3 eb=new ebay3();
		eb.helper(digits, words);
	}

}
