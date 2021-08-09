package com.imp;
import java.util.*;

public class Variables {
	public void helper() {
		int i=1;
		helper2(i);
		System.out.println(i);
		String str1="1";
		helper2(str1);
		System.out.println(str1);
		StringBuilder str2=new StringBuilder("1");
		helper2(str2);
		System.out.println(str2);
		ArrayList<Integer> list=new ArrayList<Integer>();
		helper2(list);
		System.out.println(list);
		char c='a';
		helper2(c);
		System.out.println(c);
	}
	
	public void helper2(int i) {
		for(int j=0;j<10;j++) i++;
	}
	public void helper2(char i) {
		for(int j=65;j<75;j++) {
			i=(char)j;
			//System.out.println(i);
		}
	}
	public void helper2(String i) {
		for(int j=0;j<10;j++) i=i+";";
	}
	public void helper2(StringBuilder i) {
		for(int j=0;j<10;j++) i=i.append(";");
	}
	public void helper2(ArrayList<Integer> i) {
		for(int j=0;j<10;j++) i.add(j);
	}
	
	
	
	public static void main(String[] args) {
		Variables v=new Variables();
		v.helper();
	}

}
