package com.practice;

public class CountNumber {
	public int countHomogenous(String s) {
		int result=0;
		int fre=1;
		int i=1;
		do {
			if(s.charAt(i)==s.charAt(i-1)) fre+=1;
			else {
				result+=(fre*(fre+1)/2);
				fre=1;
			}
			i++;
		}while(i<s.length());
		result+=(fre*(fre+1)/2);
		return result%1000000007;
	}

	public static void main(String[] args) {
		CountNumber cn=new CountNumber();
		String string="abbcccaaba";
		cn.countHomogenous(string);
	}

}
