package com.prep.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.prep.UniqueCharactersInString;

public class TestUniqueCharactersInString {

	@Test
	public void testNullString()
	{
		UniqueCharactersInString classUnderTest = new UniqueCharactersInString();
		String str = null;
		boolean ret = classUnderTest.areAllCharsInStrUnique(str);
		assertEquals(true, ret);
		ret = classUnderTest.areAllCharsInStrUniqueNoExtraMemory(str);
		assertEquals(true, ret);
	}
	
	@Test
	public void testEmptyString()
	{
		UniqueCharactersInString classUnderTest = new UniqueCharactersInString();
		String str = "";
		boolean ret = classUnderTest.areAllCharsInStrUnique(str);
		assertEquals(true, ret);
		ret = classUnderTest.areAllCharsInStrUniqueNoExtraMemory(str);
		assertEquals(true, ret);
	}
	
	@Test
	public void testNonRepeatingString()
	{
		UniqueCharactersInString classUnderTest = new UniqueCharactersInString();
		String str = "abc def72s";
		boolean ret = classUnderTest.areAllCharsInStrUnique(str);
		assertEquals(true, ret);
		ret = classUnderTest.areAllCharsInStrUniqueNoExtraMemory(str);
		assertEquals(true, ret);
	}
	
	@Test
	public void testRepeatingString()
	{
		UniqueCharactersInString classUnderTest = new UniqueCharactersInString();
		String str = "abc def72s ";
		boolean ret = classUnderTest.areAllCharsInStrUnique(str);
		assertEquals(false, ret);
		ret = classUnderTest.areAllCharsInStrUniqueNoExtraMemory(str);
		assertEquals(false, ret);
	}
}
