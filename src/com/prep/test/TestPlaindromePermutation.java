package com.prep.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.prep.PalindromePermutation;

public class TestPlaindromePermutation {

	@Test
	public void testPalindromePermutationUnevenTrue() {
		char[] input = new char[]{'T', 'a', 'c', 't', ' ', 'C', 'o', 'a'};
		boolean actual = PalindromePermutation.isPalindromePermutation(input);
		assertTrue(actual);
		input = new char[]{'T', 'a', 'c', 't', ' ', 'C', 'a', 'a', ' '};
		actual = PalindromePermutation.isPalindromePermutation(input);
		assertTrue(actual);
	}
	
	
	@Test
	public void testPalindromePermutationEvenTrue() {
		char[] input = new char[]{'T', 'a', 'c', 't', ' ', 'C', 'o', 'a', 'O'};
		boolean actual = PalindromePermutation.isPalindromePermutation(input);
		
		assertTrue(actual);
	}
	
	@Test
	public void testPalindromePermutationUnevenFalse() {
		char[] input = new char[]{'T', 'a', 'c', 't', ' ', 'b', 'a', 'a', ' '};
		boolean actual = PalindromePermutation.isPalindromePermutation(input);
		
		assertFalse(actual);
	}
	
	
	@Test
	public void testPalindromePermutationEvenFalse() {
		char[] input = new char[]{'T', 'a', 'c', 't', ' ', 'C', 'o', 'a', 'b'};
		boolean actual = PalindromePermutation.isPalindromePermutation(input);
		
		assertFalse(actual);
	}

}
