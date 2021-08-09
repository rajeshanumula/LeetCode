package com.practice;

public class ImplementstrStr {
	public int strStr1(String haystack, String needle) {
		int len=needle.length();
		if(len==0) return 0;
		int j=0,i=0;
		for(i=0;i<haystack.length();i++) {
			if(j!=len && needle.charAt(j)==haystack.charAt(i)) {
				j++;
				continue;
			}
			else if(j==len) {
				return i-j;
			}
			else {
				i-=j;
				j=0;
			}
		}
		if(j!=len)	return -1;
		return i-j;			
	}
	public int strStr(String haystack, String needle) {
		int len=needle.length();
		if(len==0) return 0;
		int i=0;
		for(i=0;i<haystack.length()-len+1;i++) {
			String str=haystack.substring(i,i+len);
			if(str.equals(needle))	return i;
		}
		return -1;			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementstrStr imp=new ImplementstrStr();
		String hayString="";
		String needleString="ab";
		imp.strStr(hayString, needleString);
	}

}
