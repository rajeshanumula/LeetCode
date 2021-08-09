package com.practice;
import java.util.*;

public class ShortestSubString {
	static Set<Character> set;

	static String getShortestUniqueSubstring(char[] arr, String str) {
		if (arr.length > str.length())
			return "";
		String result = "";
		set = new HashSet<>();
		refresh(arr);
		int len = arr.length;
		int left = 0;
		int right = len;
		while (right <= str.length()) {
			String sub=str.substring(left, right);
			boolean forming = checkString(sub);
			if (forming) {
				if(result.length()==0) result = sub;
				if (result.length()>0 && result.length() > right - left) {
					result =sub;
				}
				left++;
			} else {
				right++;
			}
			refresh(arr);
		}
		return result;
	}
	public static void refresh(char[] arr) {
		for(char ch: arr) set.add(ch);
	}
	public static boolean checkString(String sub) {
		for (char ch : sub.toCharArray()) {
			if (set.contains(ch)) {
				set.remove(ch);
			}
		}
		if (set.size() == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		ShortestSubString s=new ShortestSubString();
		String wordString="xyyzyzyxsyzxssyxzs";
		char[] arr= {'x','y','z','s'};
		s.getShortestUniqueSubstring(arr, wordString);
	}
}

