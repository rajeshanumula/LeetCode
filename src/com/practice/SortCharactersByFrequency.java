package com.practice;

import java.util.Arrays;

public class SortCharactersByFrequency {
	public String frequencySort(String s) {
		int[][] chars=new int[256][2];
		for(Character c:s.toCharArray()) {
			chars[c][0]=c;
			chars[c][1]++;
		}
		Arrays.sort(chars, (a,b)->b[1]-a[1]);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<=255 && chars[i][1]>0;i++) {
			while(chars[i][1]-- >0) sb.append((char)chars[i][0]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		SortCharactersByFrequency sort=new SortCharactersByFrequency();
		sort.frequencySort("rajeshreddyanumulasaiprasad");
	}

}
