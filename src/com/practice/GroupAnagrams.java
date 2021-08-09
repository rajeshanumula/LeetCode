package com.practice;
import java.util.*;
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] ca = new int[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            StringBuilder keyStr = new StringBuilder();
            for(int i=0;i<26;i++) keyStr.append(ca[i]).append(",");
            if (!map.containsKey(keyStr.toString())) map.put(keyStr.toString(), new ArrayList<>());
            map.get(keyStr.toString()).add(s);
        }
        return new ArrayList<>(map.values());
    }
	public static void main(String[] args) {
		GroupAnagrams ga=new GroupAnagrams();
		String[] inputStrings= {"bdddddddddd","bbbbbbbbbbc"};
		ga.groupAnagrams(inputStrings);
	}

}
