package com.practice;

public class StringCompression {
	public int compress(char[] chars) {
		int i = 0;
		char ch = chars[0];
		int len = 0;
		int j = 1;
		for (; j < chars.length; j++) {
			if (ch == chars[j])
				continue;
			else {
				len = j - i;
				chars[i++] = ch;
				ch = chars[j];
				if (len > 1) {
					String lenS = String.valueOf(len);
					for (char n : lenS.toCharArray()) {
						chars[i++] = n;
					}
				}
			}
		}
		len = j - i-1;
		chars[i++] = ch;
		if (len > 1) {
			String lenS = String.valueOf(len);
			for (char n : lenS.toCharArray()) {
				chars[i++] = n;
			}
		}
		return i;
	}

	public static void main(String[] args) {	
		StringCompression sCompression=new StringCompression();
		char[] chars= {'a','a','b','b','c','c','c','d'};
		sCompression.compress(chars);
	}

}
