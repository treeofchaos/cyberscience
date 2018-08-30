package com.zackary.linkedlist.stackqueuetest;
import com.zackary.linkedlist.queue.*;
import com.zackary.linkedlist.stack.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class StackQueueTest {

	@Test
	public void testStack() {
		Stack<String> myStack = new Stack<String>();
		
		myStack.push("a");
		myStack.push("b");
		myStack.push("c");

		assertEquals("c", myStack.peek());
		assertEquals(3, myStack.size());
		assertEquals("c", myStack.pop());
		assertEquals("b", myStack.pop());
		assertEquals("a", myStack.pop());
	}
	
	@Test
	public void testQueue() {
		Queue<String> myQueue = new Queue<String>();
		myQueue.enqueue("a");
		myQueue.enqueue("b");
		myQueue.enqueue("c");
		
		assertEquals("a", myQueue.peek());
		assertEquals(3, myQueue.size());
		assertEquals("a", myQueue.dequeue());
		assertEquals("b", myQueue.dequeue());
		assertEquals("c", myQueue.dequeue());

	}

}

