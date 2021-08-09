package com.practice;

public class RemoveAllAdjacentDuplicatesStringII {
	public String removeDuplicates(String s, int k) {
		if(s.length()==1) return s;
		StringBuilder sb=new StringBuilder(s);
		int slow=0,fast=0;
		while(fast<sb.length()) {
			if(fast-slow+1==k) {
				sb.replace(slow, fast+1, "");
				slow-=k+1;
				if(slow<0) slow=0;
				fast=slow;
			}
			fast++;
			if(fast< sb.length() && sb.charAt(slow)==sb.charAt(fast)) {
				continue;
			}
			else {
				slow=fast;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		RemoveAllAdjacentDuplicatesStringII rem=new RemoveAllAdjacentDuplicatesStringII();
		rem.removeDuplicates("abcdddccbbd", 3);
	}

}
