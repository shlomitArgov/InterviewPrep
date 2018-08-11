package com.prep.test;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.prep.StringPermutationChecker;

public class TestStringPermutationChecker {
	
	@Rule
	  public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testNullStrings() {
		exception.expect(NullPointerException.class);
		StringPermutationChecker.arePermutationsUsingArraySorting(null, "");
		exception.expect(NullPointerException.class);
		StringPermutationChecker.arePermutationsUsingArraySorting("", null);
		exception.expect(NullPointerException.class);
		StringPermutationChecker.arePermutationsUsingArraySorting(null, null);
		
		exception.expect(NullPointerException.class);
		StringPermutationChecker.arePermutationsUsingHashMap(null, "");
		exception.expect(NullPointerException.class);
		StringPermutationChecker.arePermutationsUsingHashMap("", null);
		exception.expect(NullPointerException.class);
		StringPermutationChecker.arePermutationsUsingHashMap(null, null);
	}
	
	@Test
	public void testDifferentLengthStrings() {
		String s1 = "abc";
		String s2 = "bcae";
		boolean actual = StringPermutationChecker.arePermutationsUsingArraySorting(s1, s2);
		Assert.assertFalse(actual);
		
		actual = StringPermutationChecker.arePermutationsUsingHashMap(s1, s2);
		Assert.assertFalse(actual);
	}

	@Test
	public void testSameLengthStringsThatAreNotPermutations() {
		String s1 = "abcd";
		String s2 = "bcae";
		boolean actual = StringPermutationChecker.arePermutationsUsingArraySorting(s1, s2);
		Assert.assertFalse(actual);
		
		actual = StringPermutationChecker.arePermutationsUsingHashMap(s1, s2);
		Assert.assertFalse(actual);
	}
	
	@Test
	public void testSameLengthStringsThatArePermutations() {
		String s1 = "abce";
		String s2 = "bcae";
		boolean actual = StringPermutationChecker.arePermutationsUsingArraySorting(s1, s2);
		Assert.assertTrue(actual);
		
		actual = StringPermutationChecker.arePermutationsUsingHashMap(s1, s2);
		Assert.assertTrue(actual);
	}
}
