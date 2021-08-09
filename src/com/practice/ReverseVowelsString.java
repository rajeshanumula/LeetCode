package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelsString {
	public String reverseVowels(String s) {
		List<Character> list=new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		char[] sb=s.toCharArray();
		int i=0,j=sb.length-1;
		while(i<j) {
			while(i<j && !list.contains(sb[i])) i++;
			while(i<j && !list.contains(sb[j])) j--;
			if(list.contains(sb[i]) && list.contains(sb[j])) {
				char temp=sb[i];
				sb[i]=sb[j];
				sb[j]=temp;
				i++;j--;
			}
		}
		return new String(sb);
	}

	public static void main(String[] args) {
		ReverseVowelsString rev=new ReverseVowelsString();
		String s="aA";
		rev.reverseVowels(s);
	}

}
