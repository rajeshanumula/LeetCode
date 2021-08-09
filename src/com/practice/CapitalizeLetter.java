package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapitalizeLetter {
	public String capital(String s) {
		StringBuilder sb=new StringBuilder(s);
		if(s.length()!=0)
			sb.replace(0, 1,String.valueOf(Character.toUpperCase(sb.charAt(0))));
		boolean isSpace=false;
		for(int i=1;i<s.length();i++) {
			if(sb.charAt(i)==' ') {
				isSpace=true;
				continue;
			}
			if(isSpace) {
				sb.replace(i, i+1,String.valueOf(Character.toUpperCase(sb.charAt(i))));
				isSpace=false;
			}
		}
		return String.valueOf(sb);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str=br.readLine();
		CapitalizeLetter cap=new CapitalizeLetter();
		String res=cap.capital(str);
		System.out.println(res);
	}
}
