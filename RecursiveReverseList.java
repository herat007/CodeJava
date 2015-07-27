/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Check List is a palindrome or not.
*/
class RecursiveReverseList
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
	 
	    recursiveReverse(n).printList();
//n.printList();
	 
    }
    
    public static LinkedListNode recursiveReverse(LinkedListNode current){
        if(current == null){
            return null;
        }
        
        if(current.next == null){
            return current;
        }
        
        LinkedListNode node = recursiveReverse(current.next);
        current.next.next = current;
        current.next = null; //set "old" next pointer to NULL
        return node;
    }
}
