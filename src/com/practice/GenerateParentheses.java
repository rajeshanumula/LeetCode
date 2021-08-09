package com.practice;
import java.util.*;
public class GenerateParentheses {
	List<String> list = new ArrayList<String>();
	public List<String> generateParenthesis(int n) {
		generateOneByOne("", n, n);
		return list;
	}

	public void generateOneByOne(String sublist, int left, int right) {
		if (left > right) {
			return;
		}
		if (left > 0) {
			generateOneByOne(sublist + "(", left - 1, right);
		}
		if (right > 0) {
			generateOneByOne(sublist + ")", left, right - 1);
		}
		if (left == 0 && right == 0) {
			list.add(sublist);
			return;
		}
	}

	public static void main(String[] args) {
		int n = 3;
		GenerateParentheses gen = new GenerateParentheses();
		gen.generateParenthesis(n);
	}

}
