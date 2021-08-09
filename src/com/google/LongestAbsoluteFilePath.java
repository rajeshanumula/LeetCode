package com.google;

public class LongestAbsoluteFilePath {
	public int lengthLongestPath(String input) {
		String[] paths = input.split("\n");
	    int[] stack = new int[paths.length+1];
	    int maxLen = 0;
	    for(String s:paths){
	        int lev = s.lastIndexOf("\t")+1;
	        int len=s.length();
    		int curLen = stack[lev]+len-lev+1;
    		stack[lev+1] =curLen;
	        if(s.contains(".")) maxLen = Math.max(maxLen, curLen-1);
	    }
	    return maxLen;
	}

	public static void main(String[] args) {
		LongestAbsoluteFilePath long1=new LongestAbsoluteFilePath();
		String input="dir\n\tsubdir111\n\t\tfile.ext\n\tsubdir2\n\t\tfile.ext";
		long1.lengthLongestPath(input);
	}

}
