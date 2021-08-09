package com.practice;
import java.util.*;
public class GenerateParentheses2t {
	List<String> result=new ArrayList<String>();
	int k;
	public List<String> generateParenthesis(int n) {
		k=n;
		helper("", 0,0);
		return result;
	}
	public void helper(String cur, int left, int right) {
		if(left<right) return;
		if(left<k) helper(cur+"(", left+1, right);
		if(right<k) helper(cur+")", left, right+1);
		if(left==k && right==k) result.add(cur);
	}
	public static void main(String[] args) {
		GenerateParentheses2t gen=new GenerateParentheses2t();
		gen.generateParenthesis(3);
	}

}
