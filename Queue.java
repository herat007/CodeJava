/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* A class for implementing a stack
*/
class Queue
{
    LinkedListNode top;
    LinkedListNode bottom;
    public Queue(int data){
        top = new LinkedListNode(data);
        bottom = top;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Queue q = new Queue(1);
	    q.enqueue(2);
	    q.enqueue(3);
	    q.enqueue(4);
	    q.printQueue();
	    
	    q.dequeue();
	    q.printQueue();
	    q.enqueue(5);
	    q.printQueue();
	    System.out.println(q.peekTop());
	    System.out.println(q.peekBottom());
	    
	}
	
	public Integer dequeue(){
	    if(top != null){
            Integer data = top.data;
            top = top.next;
            return data;
	    }
	    return null;
	}
	
	public void enqueue(int data){
	    LinkedListNode node = new LinkedListNode(data);
	    if(top == null){
	        top = node;
	        bottom = node;
	    }
	    else {
	        bottom.next = node;
	        bottom = bottom.next;
	    }
	    
	}
	
	public Integer peekTop(){
	    return top.data;
	}
	
	public Integer peekBottom(){
	    return bottom.data;
	}
	
	public void printQueue(){
	    LinkedListNode node = top;
	    while(node != null){
	       System.out.println(node.data); 
	       node =node.next;
	    }
	}
}