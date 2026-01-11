package com.neet.code.io;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EncodeDecodeString {

	public static String encode(List<String> strs) {

		if (strs.isEmpty())
			return "";

		StringBuilder sb = new StringBuilder();

		String str = strs.stream().map(m -> m.length() + "#" + m).collect(Collectors.joining(""));
		System.out.print(str);

		return null;
	}

	public static List<String> decode(String s) {

		List<String> result = new ArrayList<>();
		int i = 0;

		while (i < s.length()) {
			// Step 1: read the number (length)
			int j = i;
			while (s.charAt(j) != '#') {
				j++;
			}

			int length = Integer.parseInt(s.substring(i, j));

			// Step 2: read the string of given length
			j++; // move past '#'
			String word = s.substring(j, j + length);
			result.add(word);

			// Step 3: move index to next encoded part
			i = j + length;
		}

		return result;

	}

	public static void main(String args[]) {

		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("pqr");
		list.add("love");

		EncodeDecodeString.encode(list);
		EncodeDecodeString.decode("3#abc3#pqr4#love");

	}

}
