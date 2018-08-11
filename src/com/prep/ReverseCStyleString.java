package com.prep;

public class ReverseCStyleString {
	public static final char NULL_CHAR = '\0';

	public char[] reverse(char[] str)
	{
		int i = 0;
		if(str == null || str.length == 0 || str[0] == NULL_CHAR)
			return str;
		
		while(str[i] != NULL_CHAR)
		{
			i++;
		}
		int strlen = i;
		System.out.println("strlen: " + strlen);
		i--;	//index of the last character before NULL_CHAR
		
		char[] reversedStr = new char[strlen + 1];
		for(int j = 0; j < strlen; j++)
		{
			reversedStr[j] = str[i];
			i--;
		}
		reversedStr[strlen] = NULL_CHAR;
		return reversedStr;
	}
}
