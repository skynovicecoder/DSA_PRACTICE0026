package com.neet.code.io;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TopKFrequentElement {

	public static int[] topKFrequent(int[] nums, int k) {

		Map<Integer, Long> mp = Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k)
				.mapToInt(Map.Entry::getKey).toArray();

	}

	public static void main(String args[]) {

		TopKFrequentElement.topKFrequent(new int[] { 1, 1, 1, 1, 4, 4, 4, 5 }, 2);

	}

}
