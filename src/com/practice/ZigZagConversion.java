package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if(numRows<=1)	return s;
		String res="";
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<numRows;i++) {
			list.add("");
		}
		int increase=1;
		int rows=0;
		for(char c: s.toCharArray()) {
			list.set(rows, list.get(rows)+c);
			if(rows==0)
				increase=1;
			else if(rows==numRows-1)
				increase=-1;
			rows+=increase;
		}
		for(String str:list) {
			res+=str;
		}
		return res;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str=br.readLine();
		System.out.println("Enter number of Rows");
		int numRows=Integer.valueOf(br.readLine());
		ZigZagConversion zig=new ZigZagConversion();
		zig.convert(str, numRows);
	}

}
