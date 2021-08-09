package com.practice;

public class StringtoInteger2t {
	public int myAtoi(String s) {
		int index = 0, sign = 1, total = 0;
	    if(s.length() == 0) return 0;
	    while(index < s.length() && s.charAt(index) == ' ')
	        index ++;
	    if(index <s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')){
	        sign = s.charAt(index) == '+' ? 1 : -1;
	        index ++;
	    }
	    while(index < s.length()){
	        int digit = s.charAt(index) - '0';
	        if(digit < 0 || digit > 9) break;
	        if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
	            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	        total = 10 * total + digit;
	        index ++;
	    }
	    return total * sign;
	}

	public static void main(String[] args) {
		StringtoInteger2t str=new StringtoInteger2t();
		int k=str.myAtoi("21474836460");
		System.out.println(k);
	}

}
