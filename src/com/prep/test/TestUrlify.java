package com.prep.test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.prep.Urlify;

public class TestUrlify {

	@Test
	public void test() {
		char[] input = 	  "Mr John Smith    ".toCharArray();
		char[] expected = "Mr%20John%20Smith".toCharArray(); 
		Urlify.urlify(input, 13);

		Assert.assertArrayEquals("Expected " + Arrays.toString(expected) + "\nActual " + Arrays.toString(input), expected, input);
	}

}
