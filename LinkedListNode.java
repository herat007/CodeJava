import java.util.*;
import java.lang.*;
import java.io.*;


public class LinkedListNode {
    LinkedListNode next = null;
    int data;
    
    public LinkedListNode(int d){
        data = d;
    }
    
    public void appendToTail(int d){
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode n = this;
        while(n.next != null){
            n = n.next;
        }
        
        n.next = end;
    }
    
    public void printList(){
        LinkedListNode n = this;
        while(n != null){
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println();
    }
    
    public LinkedListNode addList(LinkedListNode n){
        while(n != null){
            this.appendToTail(n.data);
            n = n.next;
        }
        return this;
    }
}