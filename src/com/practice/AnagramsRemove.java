package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class AnagramsRemove {
	
	public List<String> anagrams(List<String> text){
		//List<String> list=new ArrayList<String>();
		if (text == null || text.size() == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i=0;i<text.size();i++) {
            char[] ca = text.get(i).toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) {
            	map.put(keyStr, new ArrayList<>());
            	map.get(keyStr).add(text.get(i));
            }
            else {
            	text.remove(i);
            	i-=1;
            }
        }
        Collections.sort(text);
		return text;
	}
	public static void main(String[] args) {
		AnagramsRemove anagramsRemove=new AnagramsRemove();
		List<String> text=new ArrayList<String>(Arrays.asList("code","doce","ecod","framer","frame"));
		System.out.println(anagramsRemove.anagrams(text));
	}

}
