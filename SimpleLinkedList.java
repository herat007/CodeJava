/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* create a simple linked list */
class SimpleLinkedList
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Node n = new Node(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
		n.printList();
	}
}

class Node {
    Node next = null;
    int data;
    
    public Node(int d){
        data = d;
    }
    
    public void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        
        n.next = end;
    }
    
    public void printList(){
        Node n = this;
        while(n != null){
            System.out.println(n.data + "->");
            n = n.next;
            
        }
    }
}