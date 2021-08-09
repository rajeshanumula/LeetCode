package com.practice;

import java.util.*;

public class SahithGS2 {
	public Set<String> helper(String letters, String[] dict) {
		HashSet<String> result=new HashSet<String>();
		HashSet<Character> letterSet=new HashSet<Character>();
		for(char ch: letters.toCharArray()) letterSet.add(ch);
		int curLen=0;
		for(String word:dict) {
			boolean containsAllLetters=true;
			if(word.length()<curLen) continue;
			for(char ch:word.toCharArray()) {
				if(!letterSet.contains(ch)) {
					containsAllLetters=false;
					break;
				}
			}
			if(containsAllLetters) {
				if(word.length()>curLen) {
					result.clear();
					curLen=word.length();
				}
				result.add(word);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String[] dictStrings= {"dog","toe","toes","etso","eetoests","do"};
		String letters="eotes";
		SahithGS2 sah=new SahithGS2();
		HashSet<String> result = new HashSet<String>();
		result.addAll(sah.helper(letters, dictStrings));
		System.out.println(result);
	}

}
