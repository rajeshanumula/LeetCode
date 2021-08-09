package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringtoInteger {
	public int myAtoi(String s) {
		if(s.length()==0)	return 0;
		int sum=0;
		int oldsum=0;
		int sign=1;
		String str="";
		int i=0;
		char c;
		for(i=0;i<s.length();i++) {
			c=s.charAt(i);
			if(c==' ' && str=="") continue;
			if(c=='-' && str=="") {
				str+="-";
				sign=-1;
				continue;
			}
			else if(c=='+' && str=="") {
				str+="+";
				continue;
			}
			else {
				break;
			}
		}
		for(;i<s.length();i++) {
			c=s.charAt(i);
			if(Character.isDigit(c)) {
				sum=oldsum*10+c-'0';
				if(sum/10!=oldsum) {
					return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
				}
				oldsum=sum;
			}
			else break;
		}
		return sign==1?sum:sum*sign;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str=br.readLine();
		StringtoInteger stoi=new StringtoInteger();
		System.out.println(stoi.myAtoi(str));
	}

}
