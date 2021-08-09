package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWordsStringIII {
	public String reverseWords(String s) {
		String[] str=s.split(" ");
		String result="";
		for(int i=0;i<str.length;i++) {
			int j=str[i].length()-1;
			while(j>=0) {
				result+=str[i].charAt(j);
				j--;
			}
			result+=" ";
		}
		return result.trim();
	}

	public static void main(String[] args) throws IOException {
		//String str="Let's take LeetCode contest";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String");
		String str=br.readLine();
		ReverseWordsStringIII rev=new ReverseWordsStringIII();
		rev.reverseWords(str);
	}

}
