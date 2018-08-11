package com.prep.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.prep.BinarySearchTree;
import com.prep.TreeNode;

public class TestBinarySearchTree {
	BinarySearchTree bst;
	Integer[] intArray = new Integer[] { 23, 45, 7, 13, 55, 84, 93, 11 };

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		bst = null;
	}

	@Test
	public void testEmptyConstructor() {
		bst = new BinarySearchTree();
		assertTrue(
				"Empty constructor failed to create empty Binary Search Tree",
				bst != null && bst.getRoot() == null);
	}

	@Test
	public void testNodeConstructor() {
		bst = new BinarySearchTree(new TreeNode(intArray[0], null, null));
		assertTrue(
				"Node constructor failed to create single Node Binary Search Tree",
				bst != null
						&& bst.getRoot().getData().compareTo(intArray[0]) == 0);
	}

	@Test
	public void testInsert() {
		int[] myArray = new int[] { 3, 4, 1, 2 };
		// Initialize bst with a null Node
		testEmptyConstructor();
		for (int i = 0; i < myArray.length; i++) {
			bst.insert(myArray[i]);
		}
		assertTrue("Insert of first node failed", bst.getRoot().getData()
				.compareTo(myArray[0]) == 0);
		assertTrue("Failed to insert right child: value = " + myArray[1], bst
				.getRoot().getRight().getData().compareTo(myArray[1]) == 0);
		assertTrue("Failed to insert left child: value = " + myArray[2], bst
				.getRoot().getLeft().getData().compareTo(myArray[2]) == 0);
		assertTrue(
				"Failed to insert grandchild: value = " + myArray[3],
				bst.getRoot().getLeft().getRight().getData()
						.compareTo(myArray[3]) == 0);

	}

	@Test
	public void testSearchDFS() {
		// Initialize bst with a null Node
		testEmptyConstructor();
		insertDummyValues();
		for (int i = 0; i < intArray.length; i++) {
			assertTrue(
					"Search failed for value = " + intArray[i],
					bst.search(intArray[i]).getData().compareTo(intArray[i]) == 0);
		}
		List<Integer> intList = Arrays.asList(intArray);
		Integer nonExistingValue = (Integer) Collections.max(intList);
		assertTrue(
				"Search found value that was not inserted into the tree. Value = "
						+ nonExistingValue,
				bst.search(nonExistingValue + 1) == null);
	}

	@Test
	public void testPrintInOrder() {
		// Initialize bst with a null Node
		testEmptyConstructor();
		insertDummyValues();
		String result = bst.printInOrder(bst.getRoot());

		StringBuilder sb = new StringBuilder();
		List<Integer> intList = Arrays.asList(intArray);
		intList.sort(null);
		Iterator<Integer> it = intList.iterator();
		while (it.hasNext()) {
			sb.append(it.next().toString() + ' ');
		}
		assertTrue("In order print failed. \nResult: " + result, sb.toString()
				.equals(result));
		System.out.println(result);
	}

	private void insertDummyValues() {
		for (int i = 0; i < intArray.length; i++) {
			bst.insert(intArray[i]);
		}
	}

}
