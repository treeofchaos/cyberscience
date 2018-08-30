package com.zackary.linkedlist.queue;
import com.zackary.linkedlist.*;

public class Queue<T> 
{
	private LinkedList<T> queue = new LinkedList<T>();
	
	public void enqueue(T data) 
	{
		queue.add(queue.size(), data);
	}
	
	public T dequeue() 
	{
		T result = queue.get(0);
		queue.remove(0);
		return result;
	}
	
	public T peek() 
	{
		return queue.get(0);
	}
	
	public int size() 
	{
		return queue.size();
	}
}

