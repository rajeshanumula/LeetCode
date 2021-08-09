package com.practice;

public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
		String[] version1Arr=version1.split("\\.");
		String[] version2Arr=version2.split("\\.");
		int i=0;
		while(i<version1Arr.length || i<version2Arr.length) {
			int a=i<version1Arr.length?Integer.parseInt(version1Arr[i]):0;
			int b=i<version2Arr.length?Integer.parseInt(version2Arr[i]):0;
			if(a<b) return -1;
			else if(a>b) return 1;
			i++;
		}
		return 0;
	}

	public static void main(String[] args) {
		CompareVersionNumbers com=new CompareVersionNumbers();
		com.compareVersion("7.5.2.4", "7.5.3");
	}

}
