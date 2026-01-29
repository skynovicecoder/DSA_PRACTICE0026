package com.neet.code.io;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StringAnagarm {
	public boolean isAnagram(String s, String t) {
		
		// using hash map
		boolean flag = false;
		if ((s == null || s.isEmpty()) || (t == null || t.isEmpty()))
			return false;
		if (s.length() != t.length())
			return false;

		char str1[] = s.toCharArray();
		char str2[] = t.toCharArray();

		//here just take these string in charr arraya
		//declare two map now interate str1 char arry 
		//now take each char as key and their count as value in two diff map for str1 and str2
		//now as we know if two map returns equals then these two string has anagram.

		HashMap<Character, Integer> mp1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mp2 = new HashMap<Character, Integer>();

		for (int i = 0; i < str1.length; i++) {

			mp1.put(str1[i], mp1.getOrDefault(s.charAt(i), 0) + 1);
			mp2.put(str2[i], mp2.getOrDefault(t.charAt(i), 0) + 1);

		}
		System.out.print(mp1);
		System.out.print(mp2);

		if (mp1.equals(mp2)) {
			return true;
		}

		return false;

	}

	public static void main(String args[]) {

		StringAnagarm obj = new StringAnagarm();
		// boolean b = obj.isAnagram("bbcc", "ccbc"); contains not work in this case
		boolean b = obj.isAnagram("bbcc", "ccbc");

		System.out.println(b);

	}

}
