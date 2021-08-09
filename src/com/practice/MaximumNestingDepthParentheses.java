package com.practice;

public class MaximumNestingDepthParentheses {
	public int maxDepth(String s) {
		int max=0;
		int level=0;
		for(Character c: s.toCharArray()) {
			if(c=='(') level++;
			else if(c==')') level--;
			if(level>max) max=level;
		}
		return max;
	}

	public static void main(String[] args) {
		MaximumNestingDepthParentheses max=new MaximumNestingDepthParentheses();
		int k=max.maxDepth("(1+(2*3)+((8)/4))+1");
		System.out.println(k);
	}

}
