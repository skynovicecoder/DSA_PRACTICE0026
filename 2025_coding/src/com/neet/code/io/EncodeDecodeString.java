package com.neet.code.io;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EncodeDecodeString {

	// Encode a list of strings into a single string
    public static String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }

        // Encode each string as "length#string" and join them
        return strs.stream()
                   .map(s -> s.length() + "#" + s)
                   .collect(Collectors.joining());
    }

    // Decode a single encoded string back into a list of strings
    public static List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return result;
        }

        int i = 0;
        while (i < s.length()) {
            // Step 1: Read the length prefix
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));

            // Step 2: Read the string of given length
            j++; // skip '#'
            String word = s.substring(j, j + length);
            result.add(word);

            // Step 3: Move index to next encoded part
            i = j + length;
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("pqr");
        list.add("love");

        // Encode
        String encoded = encode(list);
        System.out.println("Encoded string: " + encoded);

        // Decode
        List<String> decoded = decode(encoded);
        System.out.println("Decoded list: " + decoded);
    }

}

