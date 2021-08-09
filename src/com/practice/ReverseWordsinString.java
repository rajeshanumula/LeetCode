package com.practice;

public class ReverseWordsinString {
	public String reverseWords(String s) {
		String[] arr=s.split(" ",0);
		StringBuilder sb=new StringBuilder();
		for(int i=arr.length-1;i>=0;i--) {
			int temp=arr[i].length();
			if(i<arr.length-1 && arr[i]=="" && arr[i]==arr[i+1]) continue;
			if(temp!=0) sb.append(arr[i]+" ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		ReverseWordsinString rev=new ReverseWordsinString();
		String s="  hello world  ";
		String res= rev.reverseWords(s);
		System.out.println(res);
	}

}
