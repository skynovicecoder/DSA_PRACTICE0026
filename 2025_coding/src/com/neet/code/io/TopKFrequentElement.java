package com.neet.code.io;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TopKFrequentElement {

	public static int[] topKFrequent(int[] nums, int k) {
		
		//here finding top frequency like in below inputs 5 occures more then 1 and then 1 oocure then 4 so on . 
		

		Map<Integer, Long> mp = Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k)
				.mapToInt(Map.Entry::getKey).toArray();
		
		

	}

	public static void main(String args[]) {

		System.out.print(Arrays.toString(TopKFrequentElement.topKFrequent(new int[] { 1, 1, 1, 1, 4, 4,
		4, 5,5,5,5,5,5,5,5 }, 3)));
		
		

	}

}
