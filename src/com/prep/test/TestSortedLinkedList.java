package com.prep.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.prep.SortedLinkedList;

public class TestSortedLinkedList {
	
	@Test
	public void testAddToEmptyList()
	{
		SortedLinkedList myList = new SortedLinkedList();
		myList.add(0);
		
		String expectedListStr = "0";
		
		myAssertEquals(myList, expectedListStr);
	}

	@Test 
	public void testItembeforeHeadInSingleItemList()
	{
		SortedLinkedList myList = new SortedLinkedList();
		myList.add(0);
		
		myList.add(-1);
		
		String expectedListStr = "-1, 0";
		
		myAssertEquals(myList, expectedListStr);
	}
	
	@Test 
	public void testItemAfterHeadInSingleItemList()
	{
		SortedLinkedList myList = new SortedLinkedList();
		myList.add(0);
		
		myList.add(3);
		
		String expectedListStr = "0, 3";
		
		myAssertEquals(myList, expectedListStr);
	}
	
	@Test 
	public void testAddItemBeforeHeadInMuliItemList()
	{
		SortedLinkedList myList = new SortedLinkedList();
		myList.add(0);
		myList.add(3);
		myList.add(6);
		
		myList.add(-1);
		String expectedListStr = "-1, 0, 3, 6";
		
		myAssertEquals(myList, expectedListStr);
	}
	
	@Test 
	public void testAddItemAfterHeadInMuliItemList()
	{
		SortedLinkedList myList = new SortedLinkedList();
		myList.add(0);
		myList.add(6);
		myList.add(4);
		
		myList.add(3);
		String expectedListStr = "0, 3, 4, 6";
		
		myAssertEquals(myList, expectedListStr);
	}
	
	@Test 
	public void testAddItemAfterLastInMuliItemList()
	{
		SortedLinkedList myList = new SortedLinkedList();
		myList.add(0);
		myList.add(3);
		myList.add(6);
		
		myList.add(7);
		String expectedListStr = "0, 3, 6, 7";
		
		myAssertEquals(myList, expectedListStr);
	}
	
	private void myAssertEquals(SortedLinkedList myList, String expectedListStr) 
	{
		String actualListStr = myList.printListInAscendingOrder();
		assertEquals(expectedListStr,actualListStr);
		System.out.println("actualListStr = " + actualListStr);
		System.out.println("expectedListStr = " + expectedListStr);
	}
}
