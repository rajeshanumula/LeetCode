package com.practice;

import java.util.HashMap;

public class Sahith_GSS1 {
	public char helper(String input) {
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		int max=0;
		for(char ch: input.toCharArray()) {
			int count=map.getOrDefault(ch, 0);
			map.put(ch, count+1);
			if(max<count+1) max=count+1;
		}
		char result=input.charAt(0);
		for(char ch: input.toCharArray()) {
			if(map.get(ch)==max) {
				return ch;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Sahith_GSS1 s=new Sahith_GSS1();
		char r =s.helper("abbbbbbbccccccccaaaaa");
		System.out.println(r);
	}
}
