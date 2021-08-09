package com.practice;

import java.util.*;

public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<String>();
		if (nums.length == 0)
			return list;
		if (nums.length == 1) {
			list.add(String.valueOf(nums[0]));
			return list;
		}
		int i = 0;
		int j = 1;
		ArrayList<String> curStr = new ArrayList<String>();
		curStr.add(String.valueOf(nums[0]));
		while (j < nums.length) {
			if (nums[j-1]-nums[j] == -1||nums[j-1]-nums[j] == 0 ) {
				curStr.add(String.valueOf(nums[j]));
			} else {
				if (curStr.get(0) != curStr.get(curStr.size() - 1)) {
					list.add(curStr.get(0) + "->" + curStr.get(curStr.size() - 1));
				} else {
					list.add(String.valueOf(curStr.get(0)));
				}
				curStr.clear();
				i = j;
				curStr.add(String.valueOf(nums[i]));
			}
			j++;
		}
		if (curStr.get(0) != curStr.get(curStr.size() - 1)) {
			list.add(curStr.get(0) + "->" + curStr.get(curStr.size() - 1));
		} else {
			list.add(String.valueOf(curStr.get(0)));
		}
		return list;
	}

	public static void main(String[] args) {
		SummaryRanges sum = new SummaryRanges();
		int[] nums = {-2147483648,-2147483647,2147483647};
		sum.summaryRanges(nums);
	}

}
