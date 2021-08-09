package com.practice;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())	return false;
		StringBuilder sb=new StringBuilder(t);
		for(int i=0;i<s.length();i++) {
			int j=0;
			for(;j<sb.length();) {
				if(s.charAt(i)==sb.charAt(j)) {
					sb.deleteCharAt(j);
					break;
				}
				j++;
			}
			if(j==sb.length() && sb.length()!=0)	return false;
			if(sb.length()==0)	return true;
		}
		return true;
	}

	public static void main(String[] args) {
		ValidAnagram val=new ValidAnagram();
		String s="ab";
		String t="ba";
		val.isAnagram(s, t);
	}

}
