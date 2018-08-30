package com.zackary.linkedlist.stack;
import com.zackary.linkedlist.*;

public class Stack<T> 
{
    private Node<T> front;
    
    public int size(){
   	 int size = 0;
   	 Node<T> n = front;
   	 while(n != null){
   		 size++;
   		 n = n.link;
   	 }
   	 return size;
    }
    
    public T peek()
    {
    	return front.data;
    }
    
    //add to front
    public void push(T data)
    {
      	 //list is currently empty
      	 if(front == null){
      		 front = new Node<T>();
      		 front.data = data;
      	 }else{
      		 //There is at least one node
      		 Node<T> tmp = new Node<T>();
      		 tmp.data = data;
      		 tmp.link = front;
      		 front = tmp;
      	 }
    }
  
    public T pop(    )
    {
    	if (front != null) 
    	{
    		T temp = front.data;
    		front = front.link;
    		return temp;
    	}
    	return null;
    }
    
}
