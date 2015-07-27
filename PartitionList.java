/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Write code to partition a linked list around a value x, such that all nodes less than x
    come before alt nodes greater than or equal to x.  Doesnt guarantee the order
*/
class PartitionList
{
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedListNode n = new LinkedListNode(4);
		n.appendToTail(1);
		n.appendToTail(2);
		n.appendToTail(10);
		n.appendToTail(5);
		n.appendToTail(7);
		n.appendToTail(3);
		n.appendToTail(6);
		n.appendToTail(8);
	    
	    int x = 5;
	    LinkedListNode beforeStart = null;
	    LinkedListNode afterStart = null;
	    
	    LinkedListNode node = n;
	    while(node != null){
	        LinkedListNode next = node.next;
	        System.out.println(node.data);
	        if(node.data < x){
	            
	            node.next = beforeStart;
	            beforeStart = node;
	            beforeStart.printList();
	        }
	        else {
	            node.next = afterStart;
	            afterStart = node;
	            afterStart.printList();
	        }
	        node = next;
	    }
	    afterStart.printList();
	    LinkedListNode head =  beforeStart.addList(afterStart);
	   // while(beforeStart != null){
	   //     beforeStart = beforeStart.next;
	   // }
	   
	    
	    head.printList();
    }
}
