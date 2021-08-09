package com.practice;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern1(String pattern, String s) {
		HashMap<Character, String> map=new HashMap<Character, String>();
		String[] arr=s.split(" ");
		if(pattern.length()!=arr.length)	return false;
		String main="";
		for(int i=0;i<pattern.length();i++) {
			if(map.containsKey(pattern.charAt(i))) {
				if(!map.get(pattern.charAt(i)).equals(arr[i]))	return false;
				main+=map.get(pattern.charAt(i))+" ";
			}
			else {
				map.put(pattern.charAt(i), arr[i]);
				main+=arr[i]+" ";
			}
		}
		if(!main.trim().equals(s)) return false;
		else return true;
		
	}
	public boolean wordPattern(String pattern, String str) {
	    String[] words = str.split(" ");
	    if (words.length != pattern.length())
	        return false;
	    Map index = new HashMap();
	    for (Integer i=0; i<words.length; ++i)
	        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
	            return false;
	    return true;
	}

	public static void main(String[] args) {
		WordPattern word=new WordPattern();
		String pattern="abba";
		String s="dog c cat dol";
		word.wordPattern(pattern, s);
	}

}
