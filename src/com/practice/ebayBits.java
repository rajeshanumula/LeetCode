package com.practice;
import java.util.*;
public class ebayBits {
	public String booleanDeque(String[] operations, int n) {
		char[] arr=new char[n];
		Arrays.fill(arr, '0');
		TreeSet<Integer> set=new TreeSet<Integer>();
		int j=0;
		while(j<n) set.add(j++);
		for(String curString: operations) {
			if(curString=="L") {
				arr[set.first()]='1';
				set.remove(set.first());
			}
			else {
				int temp=Integer.valueOf(curString.substring(1));
				arr[temp]='0';
				set.add(temp);
			}
		}
		return String.valueOf(arr);
	}
	public static void main(String[] args) {
		ebayBits ebay=new ebayBits();
		String[] operationgs= {"L","L","C0", "L", "C3"};
		ebay.booleanDeque(operationgs, 10);
	}

}
