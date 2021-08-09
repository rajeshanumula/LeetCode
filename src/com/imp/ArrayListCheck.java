package com.imp;

import java.util.*;

public class ArrayListCheck {
	public void checkMethod(int[] nums) {
		List<int[]> list=new ArrayList<int[]>(Arrays.asList(nums));
		list.add(nums);
		System.out.println(list);
	}
	public static void main(String[] args) {
		ArrayListCheck obj=new ArrayListCheck();
		int[] nums= {1,2,3,4};
		obj.checkMethod(nums);
	}

}
