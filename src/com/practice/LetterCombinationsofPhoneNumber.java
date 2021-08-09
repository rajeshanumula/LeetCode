package com.practice;

import java.util.*;

public class LetterCombinationsofPhoneNumber {
	List<String> result = new ArrayList<String>();
	String[] letters = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	int len = 0;
	public List<String> letterCombinations(String digits) {
		if(digits.isEmpty()) return result;
		len = digits.length();
		helper(digits, 0, "");
		return result;
	}

	public void helper(String digits, int current, String comb) {
		if (current == len) {
			result.add(comb);
			return;
		}
		String word = letters[digits.charAt(current) - 50];
		for (int i = 0; i < word.length(); i++) {
			//comb += word.charAt(i);
			helper(digits, current + 1, comb + word.charAt(i));
			//comb = comb.substring(0, comb.length() - 1);
		}
	}

	public static void main(String[] args) {
		LetterCombinationsofPhoneNumber let = new LetterCombinationsofPhoneNumber();
		let.letterCombinations("23");
	}

}
