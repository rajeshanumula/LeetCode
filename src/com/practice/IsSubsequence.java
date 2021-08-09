package com.practice;

public class IsSubsequence {
//	public boolean isSubsequence(String s, String t) {
//		int i=0,j=0;
//		int slen=s.length();
//		int tlen=t.length();
//		if(slen==0)	return true;
//		if(slen>tlen)	return false;
//		if(s.equals(t))	return true;
//		
//		while(i<slen && j<tlen) {
//			if(s.charAt(i)==t.charAt(j)) {
//				i++;j++;
//			}
//			else j++;
//		}
//		if(i!=slen) return false;
//		else return true;
//	}
	 public boolean isSubsequence(String s, String t) {
	        if (s.isEmpty()) return true;
	        int match = 0;
	        for (char ch: t.toCharArray()) {
	            if (s.charAt(match) == ch && ++match >= s.length()) return true;
	        }
	        return false;
	    }

	public static void main(String[] args) {
		IsSubsequence seq=new IsSubsequence();
		String s="abc";
		String t="axdbdfc";
		seq.isSubsequence(s, t);
	}

}
