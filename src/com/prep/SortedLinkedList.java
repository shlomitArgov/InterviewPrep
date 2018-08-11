package com.prep;

public class SortedLinkedList {
	private class ListNode 
	{
		ListNode next;
		int val;
	}
	private ListNode head;
	
	private ListNode createNode(int val)
	{
		ListNode node = new ListNode();
		node.val = val;
		return node;
	}
	
	public String printListInAscendingOrder()
	{
		StringBuilder sb = new StringBuilder();
		if(head == null)
		{
			sb.append(" ");
			return sb.toString();
		}
		
		ListNode curr = head;
		while(curr != null)
		{
			sb.append(curr.val);
			if(curr.next != null)
			{
				sb.append(", ");
			}
			curr = curr.next;
		}
		return sb.toString();
	}
	
	public void add(int val)
	{
		ListNode newNode = createNode(val);
		if(head == null)
		{
			//Empty list
			head = newNode;
			return;
		}
		
		//List has at least one member - should the new node be added before the current head?
		if(val < head.val)
		{
			//Add before head
			newNode.next = head;
			head = newNode;
			return;
		}

		//The new node should be added after the list head
		ListNode prev = head;
		ListNode curr = head.next;
		
		while(curr != null)
		{
			if(val < curr.val)
			{
				//Add before curr (prev cannot be null at this point, otherwise curr would be null) 
				prev.next = newNode;
				newNode.next = curr;
				return;
			}
			//We need to continue traversing the list
			prev = curr;
			curr = prev.next;
		}
		//If we reached this point, we need to add the new node at the end of the list
		//prev points to the last member of the list
		prev.next = newNode;
		return;
	}
}