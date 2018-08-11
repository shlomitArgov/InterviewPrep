package com.prep;

public class DuplicateCharRemover 
{
	public char[] removeDups(char[] str)
	{
		int newLast = str.length - 1;
		for(int i = 0; i < newLast + 1; i++)
		{
			for(int j = i + 1; j < newLast + 1; j++)
			{
				if(str[i] == str[j])
				{
					int k = j + 1;
					if(k <= newLast)
					{
						while (k <= newLast)
						{
							if(str[k] != str[i])
							{
								swap(str, j, k);
								k++;
								if(k == newLast)
								{
									newLast = k - 1;
								}
								break;
							}
							k++;
							if(k == newLast)
							{
								newLast = k - 1;
							}
						}
					}
					else
					{
						newLast--;
					}
				}
			}
		}
		for (int i = newLast + 1; i < str.length; i++) {
			str[i] = '\0';
		}
		return str;
	}

	private void swap(char[] str, int j, int k) 
	{
		char temp = str[j];
		str[j] = str[k];
		str[k] = temp;
	}
}
