package com.practice;

public class ExcelSheet {
	public String convertToTitle(int n) {
		StringBuilder sBuilder=new StringBuilder();
		int rem=0;
		while(n>0) {
			rem=n%26;
			n=n/26;
			if(rem==0) {
				sBuilder.insert(0, (char)(90));
				n-=1;
			}
			else
				sBuilder.insert(0,(char)(64+rem));
		}
		return sBuilder.toString();
	}

	public static void main(String[] args) {
		ExcelSheet sheet=new ExcelSheet();
		sheet.convertToTitle(475930);
	}

}
