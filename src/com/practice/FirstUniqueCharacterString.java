package com.practice;

public class FirstUniqueCharacterString {
	public int firstUniqChar(String s) {
		char[] string=s.toCharArray();
		int[] chars=new int[26];
		for(int i=0;i<string.length;i++) {
			chars[string[i]-97]+=1;
		}
		for(int i=0;i<string.length;i++) {
			if(chars[string[i]-97]==1) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		FirstUniqueCharacterString fir=new FirstUniqueCharacterString();
		int k=fir.firstUniqChar("leetcode");
		System.out.println(k);
	}

}
