package com.zackary.linkedlist;

public class LinkedList<T> 
{
	private Node<T> front;

	public int size()
	{
		int size = 0;
		Node<T> n = front;
		while(n != null)
		{
			size++;
			n = n.link;
		}
		return size;
	}

	public T get(int position)
	{
		Node<T> n = front;
		for(int i=0; i<position; i++)
		{
			n = n.link;
		}
		return n.data;
	}

	//add to front.
	public void add(T data)
	{
		//list is currently empty
		if(front == null)
		{
			front = new Node<T>();
			front.data = data;
		}
		else
		{
			//There is at least one node
			Node<T> tmp = new Node<T>();
			tmp.data = data;
			tmp.link = front;
			front = tmp;
		}
	}
	public void add(int position, T data)
	{
		Node<T> before;
		Node<T> after;
		Node<T> newNode= new Node<T>();
		newNode.data = data;

		//If position is 0, add to front
		if(position == 0)
		{
			add(data);
		}
		else
		{
			before = front;
			after = front.link;
			for(int i=0; i<position;i++){
				before = before.link;
				after = after.link;
			}
			before.link = newNode;
			newNode.link= after;
		}
	}

	public T remove(int position)
	{
		if(position==0)
		{
			front = front.link;
		}
		else if(position == size() -1 )
		{
			Node<T> n = front;
			for(int i=0; i< position -1; i++)
			{
				n = n.link;
			}
			n.link = null;
		}
		else
		{
			Node<T> previous = front;
			Node<T> current = front.link;
			for(int i=0;i<position-1; i++)
			{
				previous= previous.link;
				current = current.link;
			}
			previous.link = current.link;
		}
		return null;
	}
	public void set(int position, T data)
	{
		Node<T> n = front;

		for(int i= 0;i < position;i++)
		{
			n = n.link;
		}
		n.data= data;
	}
}