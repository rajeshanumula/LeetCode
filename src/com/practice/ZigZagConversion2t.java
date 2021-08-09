package com.practice;
public class ZigZagConversion2t {
	public String convert(String s, int numRows) {
		if(numRows==1 || s.length()<=numRows) return s;
		StringBuilder[] arr=new StringBuilder[numRows];
		for(int j=0;j<numRows;j++) arr[j]=new StringBuilder();
		int i=0, increment=1,position=0;
		while(i<s.length()) {
			arr[position].append(s.substring(i,i+1));
			if(position==0) {
				increment=1;
			}
			else if(position==numRows-1) {
				increment=-1;
			}
			position+=increment;
			i++;
		}
		for(int j=1;j<numRows;j++) arr[0].append(arr[j]); 
		return arr[0].toString();
	}

	public static void main(String[] args) {
		ZigZagConversion2t zig=new ZigZagConversion2t();
		String kString= zig.convert("PAYPALISHIRING", 3);
		System.out.println(kString);
	}

}
