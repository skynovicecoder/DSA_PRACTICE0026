package com.neet.code.io;

import java.util.Arrays;

public class LongestConjecutiveSeq {

	//with sorting it will be o(nlogn) for sure, but best optimal solution can be with O(n)
	public int longestConsecutive(int[] arr) {
		

		// System.out.print(Arrays.toString(arr));
		if (arr.length == 0) {
			return 0;
		} 
		
		Arrays.sort(arr);
		int count = 1;
		int max = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {

				if (arr[i] ==arr[i-1]+ 1) {
					count++;
					max = Math.max(max, count);

				} else {
					max = Math.max(max, count);
					count = 1;
				}
			}

		}

		return Math.max(max, count);
	}
	
	//with sorting it will be o(nlogn) for sure, but best optimal solution can be with O(n)
    public static int longestConsecutive1(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        // Step 1: Sort the array
        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        // Step 2: Iterate through the sorted array
        for (int i = 1; i < n; i++) {
            // Skip duplicate elements
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 3: Check for consecutive elements
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } else {
                // Sequence breaks, reset the current streak
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1;
            }
        }

        // Step 4: Compare the final current streak
        //with the longest streak
        return Math.max(longestStreak, currentStreak);
    }

	//Best way using Set and logic that if number-1 doest not exist then that is elligible for starting point for sequence 
	//and then we can check if number+1 exist or not and increase the length and count the max length, which is best apprach as time complexity O(n)
	public int longestConsecutiveUSingSet(int[] nums) {
	    if (nums == null || nums.length == 0)
	        return 0;
	
	    Set<Integer> set = new HashSet<>();
	    for (int n : nums) {
	        set.add(n);
	    }
	
	    int longest = 0;
	
	    for (int n : set) {
	        // start of sequence
	        if (!set.contains(n - 1)) {
	            int currentNum = n;
	            int count = 1;
	
	            while (set.contains(currentNum + 1)) {
	                currentNum++;
	                count++;
	            }
	
	            longest = Math.max(longest, count);
	        }
	    }
	
	    return longest;
	}
	
	public static void main(String args[]) {

		int arr[] = {0,0,1};

		LongestConjecutiveSeq longCon = new LongestConjecutiveSeq();
		int data = longCon.longestConsecutive(arr);

		System.out.print(data);

		int dataResult = longCon.longestConsecutiveUSingSet(arr);
		System.out.print(dataResult);

	}

}

