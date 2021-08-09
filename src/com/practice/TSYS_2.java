package com.practice;
import java.util.*;
public class TSYS_2 {
	public void helper(List<String> words) {
		Collections.sort(words);
		for(int i=0;i<words.size()-1;i++) {
			System.out.println(words.get(i).compareTo(words.get(i+1)));
		}
	}
	public static void main(String[] args) {
		TSYS_2 ts=new TSYS_2();
		List<String> words=new ArrayList<String>(Arrays.asList("cc","c","cca", "cccd"));
		ts.helper(words);
	}

}
