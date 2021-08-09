package com.practice;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {
		boolean[] f = new boolean[s.length() + 1];

		f[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (f[j] && wordDict.contains(s.substring(j, i))) {
					f[i] = true;
					break;
				}
			}
		}

		return f[s.length()];
	}

	public static void main(String[] args) {
		WordBreak wb = new WordBreak();
		String s = "leetcode";
		List<String> list = new ArrayList<String>();
		list.add("leet");
		list.add("b");
		list.add("code");
		wb.wordBreak(s, list);
	}

}
