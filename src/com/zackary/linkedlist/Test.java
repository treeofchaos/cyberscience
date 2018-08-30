package com.zackary.linkedlist;
//.
import static org.junit.Assert.*;

public class Test 
{
	@org.junit.Test
	public void testAddToFrontAndGet() 
	{
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("a");
		myList.add("b");
		assertEquals("b", myList.get(0));
		assertEquals("a", myList.get(1));
	}

	@org.junit.Test
	public void testRemove()
	{
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("a");
		myList.add("b");
		myList.add("c");
		myList.add("d");
		
		myList.remove(0);
		myList.remove(1);
		myList.remove(1);
		
		assertEquals(1, myList.size());
		assertEquals("c", myList.get(0));
	}
	@org.junit.Test 
	public void testSize()
	{
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("a");
		myList.add("b");
		myList.add("c");
		
		assertEquals(3, myList.size());
	}
	@org.junit.Test
	public void testAddToMiddle()
	{
		
	}
}
