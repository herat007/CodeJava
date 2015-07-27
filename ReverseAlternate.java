/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Reverse alternate nodes
*/
class ReverseAlternate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedListNode n = new LinkedListNode(0);
		n.appendToTail(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
	    n.printList();
	    
	    LinkedListNode current = n;
	    int i=1;
	    LinkedListNode prev = null;
	    while(current !=null){
	        if(i%2==0){
	            System.out.println("i "+i +" current data "+current.data);
	            LinkedListNode temp = current.next;
	            current.next = prev;
	            prev.next = temp;
	           // prev = current;
	            
	        }
	        else{
	            System.out.println("Skipped loop4");    
	        }
	        
	        i++;
	        prev = current;
	        current = prev.next;
	        
	    }
	    
    }
}
