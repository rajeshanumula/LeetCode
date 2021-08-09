package com.practice;

public class Blend_WordCompression {
	public String helper(String a,int k) {
		if(a.length()==1) return a;
		int i=0,j=1;
		StringBuilder sb=new StringBuilder(a);
		int count=1;
		while(j<sb.length() && i>=0) {
			if(sb.charAt(i)==sb.charAt(j)) {
				count++;
				if(count==k) {
					sb.delete(i,j+1);
					i=i-k+1;
					j=i+1;
					count=1;
				}
				else j++;
			}
			else {
				i=j;
				j=i+1;;
				count=1;
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Blend_WordCompression word=new Blend_WordCompression();
		word.helper("aba",2);
	}

}
