package com.practice;

public class RomantoInteger {
	public int romanToInt(String s) {
		String[] letter = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		int sum = 0;
		if (s.length() == 1) {
			for (int i = 0; i < letter.length; i++) {
				if (s.equals(letter[i]))
					return values[i];
			}
		}
		int added = 2;

		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.length() > 1 && i < s.length() - 1) {
				temp = s.substring(i, i + 2);
				for (int j = 0; j < letter.length; j++) {
					if (temp.equals(letter[j])) {
						sum += values[j];
						added = 1;
						i++;
						break;
					}
				}
			}
			if (added != 1) {
				temp = s.substring(i, i + 1);
				for (int j = 0; j < letter.length; j++) {
					if (temp.equals(letter[j])) {
						sum += values[j];
						added = 2;
						break;
					}
				}
			}
			added=2;
		}
		return sum;
	}

	public static void main(String[] args) {
		RomantoInteger romantoInteger = new RomantoInteger();
		String s = "MCMXCVI";
		romantoInteger.romanToInt(s);
	}

}
