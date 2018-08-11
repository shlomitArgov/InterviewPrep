package com.prep;

public class Urlify {

	public static void urlify(char[] str, int length)
	{
		int newLen = length;
		for(int i = 0; i < newLen; i++)
		{
			if(str[i] == ' ')
			{
				newLen += 2;
				moveRight(str, i+1, 2, newLen);
				str[i] = '%';
				str[i + 1] = '2';
				str[i + 2] = '0';
			}
		}
	}

	private static void moveRight(char[] str, int start, int numPlaces, int strlen) {
		
		for(int i = strlen -1 ; i >= start + numPlaces; i--)
		{
			str[i] = str[i - numPlaces];
		}
	}
}
