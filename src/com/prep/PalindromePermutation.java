package com.prep;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
	
	public static boolean isPalindromePermutation(char[] str)
	{
		Map<Character, Integer> charsCount = new HashMap<>();
		Integer count = null;
		int totalNonSpaceChars = 0;
		for (int i = 0; i < str.length; i++) 
		{
			if(str[i] == ' ')
			{
				continue;
			}
			count = charsCount.get(Character.toLowerCase(str[i]));
			if(count == null)
			{
				charsCount.put(Character.toLowerCase(str[i]), 1);
			}
			else
			{
				charsCount.put(Character.toLowerCase(str[i]), count.intValue() + 1);
			}
			totalNonSpaceChars++;
		}
		
		int numUnEvenAppearences = 0;
		for (char c : charsCount.keySet()) 
		{
			if(charsCount.get(c).intValue() %2 != 0)
			{
				numUnEvenAppearences++;
			}
		}
		
		if(totalNonSpaceChars %2 == 0 && numUnEvenAppearences != 0)
		{
			return false;
		}
		

		if(totalNonSpaceChars %2 != 0 && numUnEvenAppearences != 1)
		{
			return false;
		}
		
		return true;
	}
}
