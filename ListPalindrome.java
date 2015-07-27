/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Check List is a palindrome or not.
*/
class ListPalindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedListNode n = new LinkedListNode(4);
		n.appendToTail(1);
		n.appendToTail(2);
		n.appendToTail(1);
		n.appendToTail(2);
	    
	    LinkedListNode slow = n;
	    LinkedListNode fast = n;
	    Stack<Integer> s = new Stack<Integer>();
	    
	    while(fast !=null && fast.next != null){
	        s.push(slow.data);
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    if(fast != null)
	        slow = slow.next;
	    
	    while(slow != null){
	        int top = s.pop().intValue();
	        if(top != slow.data){
	            System.out.println("NOT A PALINDROME");
	            return;
	        }
	        slow = slow.next;
	    }
	    
	    System.out.println("IT IS A PALINDROME");
    }
}
