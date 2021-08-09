package com.practice;

import java.util.*;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.size() == 1)
			return triangle.get(0).get(0);
		// int temp=triangle.get(0).get(0);
		int min = helper(0, 0, 0, triangle);
		return min;
	}

	public int helper(Integer row, int index, int min, List<List<Integer>> triangle) {
		if (row == triangle.size()) {
			return min;
		}
		int first = helper(row + 1, index, min + triangle.get(row).get(index), triangle);
		if (index + 1 < triangle.get(row).size()) {
			int second = helper(row + 1, index + 1, min + triangle.get(row).get(index + 1), triangle);
			return Math.min(first, second);
		}
		return first;
	}

	public static void main(String[] args) {
		Triangle tr = new Triangle();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(new ArrayList<Integer>(Arrays.asList(2)));
		list.add(new ArrayList<Integer>(Arrays.asList(3, 4)));
		list.add(new ArrayList<Integer>(Arrays.asList(6, 5, 7)));
		list.add(new ArrayList<Integer>(Arrays.asList(4, 1, 8,3)));
//		list.add(new ArrayList<Integer>(Arrays.asList(6, 5, 5, 7)));
//		list.add(new ArrayList<Integer>(Arrays.asList(4, 6, 8, 1, 3)));
		tr.minimumTotal(list);
	}

}
