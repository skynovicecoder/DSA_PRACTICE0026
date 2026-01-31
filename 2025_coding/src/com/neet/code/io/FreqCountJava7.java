package com.neet.code.io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FreqCountJava7 {
	public static void main(String args[]) {

		// input
		int arr[] = { 1, 2, 1, 3, 4, 5, 6, 6, 7, 7, 1 };

		//using java 7
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);

			}

		}
		System.out.print(mp);

		//Using Java 8, just for remebering usage of Collectors
		Map<Integer, Long> freqMap = Arrays.stream(arr)
                                           .boxed()
                                           .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println("Frequency of elements: " + freqMap);

	}

}

