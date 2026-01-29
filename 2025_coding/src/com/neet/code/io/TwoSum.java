package com.neet.code.io;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		// brute force

		if (nums == null)
			return new int[0];

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}

		return new int[0];
	}

	public int[] twoSumHashMap(int[] nums, int target) {

		// hash map

		if (nums == null)
			return new int[0];
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];

			int diff = target - nums[i];
			if (mp.containsKey(diff)) {
				return new int[] { mp.get(diff), i };
			}
			mp.put(num, i);

		}

		return new int[0];
	}

	public static void main(String args[]) {
		TwoSum obj = new TwoSum();

		int arr[] = obj.twoSumHashMap(new int[] { 2, 4, 6, 10 }, 10);
		System.out.println(Arrays.toString(arr));

	}

}
