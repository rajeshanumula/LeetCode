package com.practice;

public class MinimumChanges {
	public int minOperations(String s) {
		int count1 = 0, count2 = 0;
		if (s.length() == 1)
			return 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '0')
				count1 += 1;
			if (s.charAt(i) == '1')
				count2 += 1;
			if (s.charAt(i + 1) == '1')
				count1 += 1;
			if (s.charAt(i + 1) == '0')
				count2 += 1;
			i += 1;
		}
		if(s.length()%2!=0) {
			if (s.charAt(s.length()-1) == '0')
				count1 += 1;
			if (s.charAt(s.length()-1) == '1')
				count2 += 1;
		}
		return Math.min(count1, count2);
	}

	public static void main(String[] args) {
		MinimumChanges min=new MinimumChanges();
		min.minOperations("0100");
	}

}
