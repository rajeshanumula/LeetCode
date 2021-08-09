package com.practice;
import java.util.*;
public class SubArraySumEqualsK2t {
	public int subarraySum(int[] nums, int k) {
		int sum = 0, result = 0;
		Map<Integer, Integer> preSum = new HashMap<>();
		preSum.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (preSum.containsKey(sum - k)) {
				result += preSum.get(sum - k);
			}
			preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
		}

		return result;
	}

	public static void main(String[] args) {
		SubArraySumEqualsK2t k=new SubArraySumEqualsK2t();
		int[] nums= {1,2,3,0,2,1,3};
		k.subarraySum(nums, 3);
	}

}
