package com.practice;

import java.util.*;

public class LongestValidParanthesis {
	public int longestValidParentheses(String s) {
		int max = 0;
		int cur = 0;
		int curMax = 0;
		Stack<Character> stack = new Stack<>();
		char[] arr = s.toCharArray();
		for (int i = 0; i <= arr.length; i++) {
			if (i == arr.length) {
				if (stack.isEmpty()) {
					curMax += cur;
					cur = 0;
					if (max < curMax)
						max = curMax;
					return max;
				} else {
					if (cur > max)
						max = cur;
					if(curMax>max) max=curMax;
					return max;
				}
			}
			if (arr[i] == '(') {
				if (stack.isEmpty()) {
					curMax += cur;
					cur = 0;
				}
				stack.push('(');
			} else {
				if (stack.isEmpty()) {
					curMax += cur;
					cur = 0;
					if (max < curMax)
						max = curMax;
				} else {
					cur += 2;
					stack.pop();
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		LongestValidParanthesis longe=new LongestValidParanthesis();
		int res=longe.longestValidParentheses(")(()()(())(()");
		System.out.println(res);
	}

}
