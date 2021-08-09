package com.practice;
import java.util.*;
public class PascalTriangle {
	List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> generate(int numRows) {
		if(numRows==0)return result;
		if(numRows<2) {
			List<Integer> list=new ArrayList<Integer>();
			list.add(1);
			result.add(list);
		}
		else if(numRows<3) {
			List<Integer> list=new ArrayList<Integer>();
			list.add(1);
			result.add(list);
			List<Integer> list1=new ArrayList<Integer>();
			list1.add(1);
			list1.add(1);
			result.add(list1);
		}
		else if(numRows>=3) {
			List<Integer> list=new ArrayList<Integer>();
			list.add(1);
			result.add(list);
			List<Integer> list1=new ArrayList<Integer>();
			list1.add(1);
			list1.add(1);
			result.add(list1);
			for(int i=2;i<numRows;i++) {
				List<Integer> list2=new ArrayList<Integer>();
				list2.add(1);
				for(int j=1;j<i;j++) {
					list2.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
				}
				list2.add(1);
				result.add(list2);
			}
		}
		System.out.print(result);
		return result;
	}

	public static void main(String[] args) {
		PascalTriangle pascal=new PascalTriangle();
		pascal.generate(6);
	}

}
