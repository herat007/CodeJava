/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* A class for implementing a stack
*/
class Stack1
{
    LinkedListNode top;
    public Stack1(int data){
        top = new LinkedListNode(data);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Stack1 s = new Stack1(1);
	    s.push(2);
	    s.push(3);
	    s.push(4);
	    s.printStack();
	    
	    s.pop();
	    s.printStack();
	    s.push(5);
	    s.printStack();
	    System.out.println(s.peek());
	    
	}
	
	public Integer pop(){
	    if(top != null){
            Integer data = top.data;
            top = top.next;
            return data;
	    }
	    return null;
	}
	
	public void push(int data){
	    LinkedListNode node = new LinkedListNode(data);
	    node.next = top;
	    top = node;
	    
	}
	
	public Integer peek(){
	    return top.data;
	}
	
	public void printStack(){
	    LinkedListNode node = top;
	    while(node != null){
	       System.out.println(node.data); 
	       node =node.next;
	    }
	}
}