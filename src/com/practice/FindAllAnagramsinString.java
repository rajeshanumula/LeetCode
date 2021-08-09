package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinString {
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> result=new ArrayList<Integer>();
		char[] ch=p.toCharArray();
		Arrays.sort(ch);
		p=String.valueOf(ch);
		for(int i=0;i<=s.length()-p.length();i++) {
			String sub=s.substring(i,i+p.length());
			char[] subch=sub.toCharArray();
			Arrays.sort(subch);
			sub=String.valueOf(subch);
			if(p.equals(sub)) result.add(i);
		}
		return result;
	}

	public static void main(String[] args) {
		FindAllAnagramsinString ob=new FindAllAnagramsinString();
		String s="cbaebabac";
		String p="abc";
		ob.findAnagrams(s, p);
	}

}
