package com.practice;

import java.util.*;

public class RestoreIPAddresses {
	List<String> list = new ArrayList<String>();
	public List<String> restoreIpAddresses(String s) {
		if(s.length()<4 || s.length()>12) return list;
		helper(0, "", s);
		return list;
	}
	public void helper(int cur, String address, String remaining) {
		if (cur == 3) {
			if(remaining.length()>3 || remaining.length()==0 ||Integer.valueOf(remaining) > 255||(remaining.length()>1 && remaining.charAt(0)=='0')) {
				return;
			}
			else {
				list.add(address + remaining);
				return;
			}
		}
		for (int j = 1; j <= 3; j++) {
			if (j <= remaining.length()) {
				String temp = remaining.substring(0, j);
				if(temp.length()>1 && temp.charAt(0)=='0') continue;
				if (Integer.parseInt(temp) <= 255) {
					temp = address + temp + ".";
					helper(cur + 1, temp, remaining.substring(j));
				}
			}
		}
	}

	public static void main(String[] args) {
		RestoreIPAddresses res = new RestoreIPAddresses();
		res.restoreIpAddresses("1010111110");
	}

}
