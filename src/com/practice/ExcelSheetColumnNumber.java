package com.practice;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int i=s.length()-1;
		int p=0;
		int num=0;
		while(i>=0) {
			num+=(s.charAt(i)-64)*Math.pow(26, p);
			p++;
			i--;
		}
		return num;
	}

	public static void main(String[] args) {
		ExcelSheetColumnNumber sheet=new ExcelSheetColumnNumber();
		sheet.titleToNumber("AAAZZ");
	}

}
