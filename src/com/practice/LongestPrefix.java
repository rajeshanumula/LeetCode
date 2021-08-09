package com.practice;

public class LongestPrefix {
	public String longestCommonPrefix(String[] strs) {
		int arrlen = strs.length;
		if (arrlen == 0)
			return "";
		String returnedString = "";
		int index = 0;
		int j = 0;
		char ch;
		while (j < strs[0].length()) {
			ch = strs[0].charAt(j);
			for (int i = 1; i < arrlen; i++) {
				if(strs[i].length()<=index) return returnedString;
				if (ch != strs[i].charAt(j)) return returnedString;
			}
			returnedString += ch;
			j++;
			index++;
		}
		return returnedString;
	}

	public static void main(String[] args) {
		LongestPrefix longestPrefix = new LongestPrefix();
		String[] strs = { "" };
		longestPrefix.longestCommonPrefix(strs);
	}

}
