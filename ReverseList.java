/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Check List is a palindrome or not.
*/
class ReverseList
{
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedListNode n = new LinkedListNode(0);
		n.appendToTail(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
	 //   n.printList();
	    
	    LinkedListNode head = n;
	    LinkedListNode second = head.next;
	    LinkedListNode third = second.next;
	    
	    second.next = head;
	    
	    head.next = null;
	    if (third == null){
	        return;
	    }
	    
	    LinkedListNode current = third;
	    LinkedListNode prev = second;
	    
	    while(current != null) {
	        LinkedListNode next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    }
	    head = prev;
	    
	    head.printList();
    }
}
