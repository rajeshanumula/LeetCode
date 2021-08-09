package com.practice;

import java.util.*;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length()) return false;
        Map<Character, Character> map=new HashMap<>();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if(map.containsKey(sc)) {
            	if(map.get(sc)!=tc) return false;
            }
            else{
                if(set.contains(tc)) return false;
                map.put(sc,tc);
                set.add(tc);
            }
        }
        return true;
	}

	public static void main(String[] args) {
		IsomorphicStrings iso=new IsomorphicStrings();
		String s="egg";
		String t="add";
		iso.isIsomorphic(s, t);
	}
}
