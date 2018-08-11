package com.prep;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersInString {
	
	public boolean areAllCharsInStrUnique(String str)
	{
		if(str == null || str.isEmpty() || str.length() == 1)
			return true;
		
		char[] strChars = str.toCharArray();
		Set<Character> charsSet = new HashSet<>();
		for (char c : strChars) 
		{
			if(charsSet.contains(c))
			{
				System.out.println(String.format("Repeating character '%c'.", c));
				return false;
			}
			charsSet.add(c);
		}
		return true;
	}
	
	
	public boolean areAllCharsInStrUniqueNoExtraMemory(String str)
	{
		if(str == null || str.isEmpty() || str.length() == 1)
			return true;
		
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = i + 1; j < str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					System.out.println(String.format("Repeating character '%c'.", str.charAt(i)));
					return false;
				}
			}
		}
		return true;
	}
}
