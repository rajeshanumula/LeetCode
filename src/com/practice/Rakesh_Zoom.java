package com.practice;

import java.util.HashMap;

public class Rakesh_Zoom {
	public boolean helper(String ransomNote, String magazine) {
		if(ransomNote.length()>magazine.length()) return false;
		HashMap<Character, Integer> map1=new HashMap<>();
		for(char ch:magazine.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
		}
		
		HashMap<Character, Integer> map2=new HashMap<>();
		for(char ch:ransomNote.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0)+1);
			if(map2.get(ch)>map1.getOrDefault(ch,0)) return false;
		}
		return true;
	}
	public void helper2() {
		
	}
	public static void main(String[] args) {
		Rakesh_Zoom obj=new Rakesh_Zoom();
		boolean a =obj.helper("abc","aab");
		System.out.println(a);
	}

}
