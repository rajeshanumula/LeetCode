package com.practice;
import java.util.*;
public class GroupAnagrams2t {	
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map=new HashMap<String, List<String>>();
		for(int i=0;i<strs.length;i++) {
			char[] arr=strs[i].toCharArray();
			Arrays.sort(arr);
			String temp=String.valueOf(arr);
			if(map.containsKey(temp)) map.get(temp).add(strs[i]);
			else map.put(temp, new ArrayList<String>(Arrays.asList(strs[i])));
		}
		return new ArrayList<List<String>>(map.values());
	}

	public static void main(String[] args) {
		GroupAnagrams2t gt=new GroupAnagrams2t();
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		gt.groupAnagrams(strs);
	}

}
