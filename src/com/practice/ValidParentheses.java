package com.practice;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		char[] sArr=s.toCharArray();
		Stack<Character> stack=new Stack<Character>();
		for(Character c:sArr) {
			if(c=='(') stack.push(')');
			else if(c=='[') stack.push(']');
			else if(c=='{') stack.push('}');
			else {
				if(!stack.isEmpty() && stack.pop()==c) continue;
				else return false;
			}
		}
		if(!stack.isEmpty()) return false;
		return true;
	}

	public static void main(String[] args) {
		ValidParentheses val=new ValidParentheses();
		boolean res= val.isValid("(()()(){}{}[][{{}()[]([{()}])}]))");
		System.out.println(res);
	}

}
