package com.practice;
import java.util.*;
public class IsomorphicStrings2t {
	public boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length()) return false;
		HashMap<Character, Character> map=new HashMap<Character, Character>();
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), t.charAt(i));
			else {
				if(map.get(s.charAt(i))!=t.charAt(i)) return false;
			}
		}
		map.clear();
		for(int i=0;i<t.length();i++) {
			if(!map.containsKey(t.charAt(i))) map.put(t.charAt(i), s.charAt(i));
			else {
				if(map.get(t.charAt(i))!=s.charAt(i)) return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		IsomorphicStrings2t iso=new IsomorphicStrings2t();
		String a="paper";
		String b="title";
		iso.isIsomorphic(a, b);
	}

}
