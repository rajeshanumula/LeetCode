package com.practice;

public class RomantoInteger2t {
	public int romanToInt(String s) {
		int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int i=0;
		int result=0;
		while(s.length()>0) {
			if(s.length()>1 && s.substring(0,2).equals(letters[i])){
				result+=nums[i];
				s=s.substring(2);
			}
			else if(s.substring(0,1).equals(letters[i])) {
				result+=nums[i];
				s=s.substring(1);
			}
			else i++;
		}
		return result;
	}

	public static void main(String[] args) {
		RomantoInteger2t rom = new RomantoInteger2t();
		int res=rom.romanToInt("MMMCMXCIX");
		System.out.println(res);
	}

}
