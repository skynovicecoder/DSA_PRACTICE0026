package com.neet.code.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContainsDuplicate {
	public boolean hasDuplicate(int[] nums) {

		// using set  : here if set has already that value it returns false so we put not sign before it will
		//become true so we can say list has duplicate value
		
//		boolean hasDuplicate;
//		Set<Integer> st = new HashSet<Integer>();
//		hasDuplicate = Arrays.stream(nums).anyMatch(n -> !st.add(n));
//
//		if (hasDuplicate) {
//			return hasDuplicate;
//
//		}
//		return hasDuplicate;

		// using brute force
		//Time Complexity: O(n2)
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	//Time Complexity: O(n)
	public boolean hasDuplicateUsingSet(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

	//Slightly more memory overhead (boxing integers)
	public boolean hasDuplicateUsingStreams(int[] nums) {
        return Arrays.stream(nums)
                     .boxed()
                     .collect(Collectors.toSet())
                     .size() != nums.length;
    }

	public static void main(String args[]) {
		ContainsDuplicate obj = new ContainsDuplicate();
		int arr[] = { 4, 1, 2, 3, 4 };
		boolean b = obj.hasDuplicate(arr);
		System.out.print(b);

		boolean method1 = obj.hasDuplicateUsingSet(arr);
		System.out.print(method1);

		boolean method2 = obj.hasDuplicateUsingStreams(arr);
		System.out.print(method2);
	}
}

