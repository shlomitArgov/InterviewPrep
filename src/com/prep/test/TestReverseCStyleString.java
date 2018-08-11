package com.prep.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import com.prep.ReverseCStyleString;

public class TestReverseCStyleString {

	@Test
	public void testNullStr()
	{
		ReverseCStyleString classUnderTest = new ReverseCStyleString();
		char[] str = null;
		char[] actual = classUnderTest.reverse(str);
		assertEquals(null, actual);	
	}

	@Test
	public void testEmptyStr()
	{
		ReverseCStyleString classUnderTest = new ReverseCStyleString();
		char[] str = new char[0];
		char[] actual = classUnderTest.reverse(str);
		assertEquals(str, actual);
		
		str = new char[]{ReverseCStyleString.NULL_CHAR};
		actual = classUnderTest.reverse(str);
		assertEquals(str, actual);
	}

	@Test
	public void testNonEmptyStr()
	{
		ReverseCStyleString classUnderTest = new ReverseCStyleString();
		char[] str = new char[]{'a', 'b', 'c', 'd', ReverseCStyleString.NULL_CHAR};
		char[] actual = classUnderTest.reverse(str);
		char[] expected = new char[]{'d', 'c', 'b', 'a', ReverseCStyleString.NULL_CHAR};
		
		assertArrayEquals(expected, actual);
		
	}
}
