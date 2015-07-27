/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Implement an algorithm to find the kth to last element of a singly linked list.
*/
class KthToLastElement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedListNode n = new LinkedListNode(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
		n.appendToTail(6);
		int k = 2;
		
		LinkedListNode p1 = n;
		LinkedListNode p2 = n;
		
		for(int i =0 ; i<= k-1; i++){
		    p2 = p2.next;
		}
		
		if(p2 == null){
		    return;
		}
		
		while(p2 != null){
		    p1 = p1.next;
		    p2 = p2.next;
		}
		
		System.out.println(p1.data);
    }
}