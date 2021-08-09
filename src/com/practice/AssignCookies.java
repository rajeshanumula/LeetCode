package com.practice;

import java.util.Arrays;

public class AssignCookies {
	public int findContentChildren(int[] g, int[] s) {
		if(s.length==0 || g.length==0)	return 0;
		Arrays.sort(g);
		Arrays.sort(s);
		int assigned=0;
		int i=0,j=0;
		while(i<g.length && j<s.length){
			if(g[i]<=s[j]) {
				assigned++;
				i++;
			}
			j++;
		}
		return assigned;
	}

	public static void main(String[] args) {
		AssignCookies assign=new AssignCookies();
		int[] g= {1,2,3,18};
		int[] s= {1,1,5,6,7,9};
		assign.findContentChildren(g, s);
	}

}
