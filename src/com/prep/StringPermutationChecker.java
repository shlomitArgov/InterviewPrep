package com.prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringPermutationChecker {
	//O(NlogN) run time because of the sorting, O(N) additional memory for the char arrays
	public static boolean arePermutationsUsingArraySorting(String s1, String s2) throws NullPointerException
	{
		if(s1 == null || s2 == null)
			throw new NullPointerException(String.format("String 1 = %s, String 2 = %s", s1, s2));
		char[] s1Chars = s1.toCharArray(); //O(N)
		char[] s2Chars = s2.toCharArray(); //O(N)
		Arrays.sort(s1Chars); //O(NlogN)
		Arrays.sort(s2Chars); //O(NlogN)
		return Arrays.equals(s1Chars, s2Chars); //O(N)
	}
	
	//O(N) run time
		public static boolean arePermutationsUsingHashMap(String s1, String s2) throws NullPointerException
		{
			if(s1 == null || s2 == null)	// O(1)
				throw new NullPointerException(String.format("String 1 = %s, String 2 = %s", s1, s2));
			
			if(s1.length() != s2.length()) // O(1)
				return false;
			
			Map<Character, Integer> charCountMap = new HashMap<>();
			Integer count;
			for(int i = 0; i < s1.length(); i++)	// O(N)
			{
				if((count = charCountMap.get(s1.charAt(i))) != null)
				{
					charCountMap.put(s1.charAt(i), count.intValue() + 1);
				}
				else
				{
					charCountMap.put(s1.charAt(i), 1);
				}
			}
			
			for (int i = 0; i < s1.length(); i++)  // O(N)
			{
				count = charCountMap.get(s2.charAt(i));
				if(count == null)
				{
					return false;
				}
				if(count == 1)
				{
					charCountMap.remove(s2.charAt(i));
				}
				else
				{
					charCountMap.put(s2.charAt(i), count -1);
				}
			}
			//Both strings are the same length, s2 contains all characters in string 1 the same number of times
			// --> they are permutations of each other
			return true;
		}
}
