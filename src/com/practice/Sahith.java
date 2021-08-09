package com.practice;

import java.util.HashSet;
import java.util.Set;


public class Sahith {
	public int helper(int[] arr) {
		int first=arr[0];
		int i=1;
		while(i<arr.length && first==arr[i]) i++;
		if(i>=arr.length) return -1;
		int second=arr[i];
		if(first<second) {
			second=arr[0];
			first=arr[i];
		}
		i++;
		for(;i<arr.length;i++) {
			if(arr[i]>first && arr[i]>second) {
				second=first;
				first=arr[i];
			}else if(arr[i]>second && arr[i]!=first) {
				second=arr[i];
			}
		}
		return second;
	}
	
	public int helper2(int a , int b) {
		int firstNum=(int)Math.sqrt(a);
		int count=0;
		int DupA=firstNum*firstNum;
		if(DupA==a) count++;
		firstNum++;
		DupA=firstNum*firstNum;
		while(DupA<=b) {
			count++;
			firstNum++;
			DupA=firstNum*firstNum;
		}
		return count;
	}
	
	public int helper3(int[] A , int[] B, int M, int X, int Y) {
		int count=0;
		Set<Integer> floors=new HashSet<>();
		int totalWeight=0;
		int persons=0;
		int i=0;
		totalWeight+=A[0];
		floors.add(B[0]);
		persons++;
		i=1;
		boolean floorExists=false;
		while(i<A.length) {
			totalWeight+=A[i];
			if(floors.contains(B[i])) floorExists=true;
			floors.add(B[i]);
			persons++;
			if(totalWeight>Y || persons>X) {
				if(floorExists) count+=floors.size()+1;
				else count+=floors.size();
				floors.clear();
				totalWeight=0;
				persons=0;
				i--;
			}
			i++;
			floorExists=false;
		}
		if(floors.size()!=0) count+=floors.size()+1;
		return count;
	}
	
	public void SahithVerizon() {
		
	}
	
	public String revString(String text) {
		int start=0;
		StringBuilder sb=new StringBuilder(text);
		while(start<text.length() && !Character.isLetterOrDigit(text.charAt(start))) start++;
		int end=start+1;
		for(;end<=text.length();end++) {
			if(end==text.length() || !Character.isLetterOrDigit(text.charAt(end))) {
				StringBuilder cur=new StringBuilder(text.substring(start,end));
				cur=cur.reverse();
				sb.replace(start, end, cur.toString());
				start=end;
				while(start<text.length() && !Character.isLetterOrDigit(text.charAt(start))) start++;
				end=start+1;
			}
		}
		return sb.toString();
	}
	
	public String helper1(String str1) {
		int[] arr=new int[256];
		StringBuilder sb=new StringBuilder(str1);
		int i=0;
		int j=0;
		while(i<str1.length()) {
			char cur=str1.charAt(i);
			if(arr[cur]!=0) {
				sb.deleteCharAt(j);
			}else {
				arr[cur]=1;
				j++;
			}
			i++;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Sahith sa=new Sahith();
		//int[] arr= {-12,36,13,100,90,102023,12023};
		//int a=sa.helper(arr);
		//String a =sa.helper1("goodmorning");
		//System.out.println(a);
		int[] A= {40,40,100,80,20};
		int[] B= {3,3,2,2,3};
		int X=0;
		int Y=0;
		int[] A1= {60,80,40};
		int[] B1= {2,3,5};
		int X1=0;
		int Y1=0;
		
		//int a=sa.helper3(A, B, 3,5,200);
		//System.out.println(a);
		//String input1="abc., 12def. eds"; //result:"cba., fed21. sde"
		//String input2=".,@ abc., 12def. eds  .<!@#$%^&*( abc1234def"; //result:".,@ cba., fed21. sde  .<!@#$%^&*( fed4321cba"
		//String result=sa.revString(input2);
		//System.out.println(result);
		sa.SahithVerizon();
		System.out.println();
	}

}
