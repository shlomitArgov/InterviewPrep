package com.prep.test;

import org.junit.Assert;
import org.junit.Test;

import com.prep.DuplicateCharRemover;

public class TestDuplicateCharRemover {

	@Test
	public void testNoDups()
	{
		DuplicateCharRemover classUnderTest = new DuplicateCharRemover();
		char[] str = new char[]{'a', 'b', 'c'};
		char[] actual = classUnderTest.removeDups(str);
		char[] expected = new char[]{'a', 'b', 'c'};
//		for (char c : actual) {
//			System.out.print(c);
//		}
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSingleCharDup()
	{
		DuplicateCharRemover classUnderTest = new DuplicateCharRemover();
		char[] str = new char[]{'a', 'b', 'a', 'd', 'e', 'a'};
		char[] actual = classUnderTest.removeDups(str);
		char[] expected = new char[]{'a', 'b', 'd', 'e', '\0', '\0'};
//		for (char c : actual) {
//			System.out.print(c);
//		}
//		System.out.println();
//		for (char c : expected) {
//			System.out.print(c);
//		}
		Assert.assertArrayEquals(expected, actual);
	}
}
