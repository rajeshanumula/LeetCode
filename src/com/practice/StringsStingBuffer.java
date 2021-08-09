package com.practice;

public class StringsStingBuffer {
	public void helper() {
		char[] charArray= {'a','b','c'};
		System.out.println(String.valueOf(charArray));
		String str1="RajeshReddy";
		String str2="Raj";
		str2+="esh";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
		
		String str6="flower";
		String str7="flow";
		System.out.println(str7.compareTo(str6));
		
		String str3="reddy";
		String str4="rajeshreddy";
		String str5="rajesh";
		System.out.println(str5.concat(str3).equals(str4));
		String concatString = "concatString";
		StringBuffer appendBuffer = new StringBuffer("appendBuffer");
		StringBuilder appendBuilder = new StringBuilder("appendBuilder");
		long timerStarted;

		timerStarted = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
		    concatString += " another string";
		}
		System.out.println("Time needed for 50000 String concatenations: " + (System.currentTimeMillis() - timerStarted) + "ms");

		timerStarted = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
		    appendBuffer.append(" another string");
		}
		System.out.println("Time needed for 50000 StringBuffer appends: " + (System.currentTimeMillis() - timerStarted) + "ms");
		        
		timerStarted = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
		    appendBuilder.append(" another string");
		}
		System.out.println("Time needed for 50000 StringBuilder appends: " + (System.currentTimeMillis() - timerStarted) + "ms");
	}
	public static void main(String[] args) {
		StringsStingBuffer buf=new StringsStingBuffer();
		buf.helper();
	}

}
