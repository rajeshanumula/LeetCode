package com.practice;

import java.util.Stack;

public class ValidParentheses2t {
	public boolean isValid(String s) {
		if(s.length()%2!=0) return false;
		char[] charArr=s.toCharArray();
		Stack<Character> stack=new Stack<Character>();
		int i=0;
		while(i<charArr.length) {
			if(charArr[i]=='{' ||charArr[i]=='(' ||charArr[i]=='[') stack.push(charArr[i]);
			else if(stack.size()>0){
				char cur=stack.pop();
				if(cur=='(' && charArr[i]!=')') return false;
				else if(cur=='[' && charArr[i]!=']') return false;
				else if(cur=='{' && charArr[i]!='}') return false;
			}
			else return false;
			i++;
		}
		if(stack.size()!=0) return false;
		return true;
	}

	public static void main(String[] args) {
		ValidParentheses2t val=new ValidParentheses2t();
		val.isValid("()(){[(])}(())");
	}

}
