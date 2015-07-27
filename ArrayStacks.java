/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Describe how you could usea single array to implement three stacks. */
class ArrayStacks
{
    int stackSize = 100;
    int[] stack = new int[stackSize * 3];
    int[] pointers = new int[]{-1,-1,-1}; // Pointers to track the top element of the stack
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
	}
	
	public static void push(int stackNum, int data){
	    if(pointers[stackNum] + 1 >= stackSize){
	        System.out.println("STACK IS OUT OF SPACE!!");
	    }
	    pointer[stackNum]++;
	    stack[topOfStack(stackNum)] = data;
	}
	
	public static int pop(int stackNum){
	    if(pointer[stackNum] = -1){
	        System.out.println("STACK IS EMPTY!!!!");
	    }
	    int value = stack[topOfStack(stackNum)];
	    stack[topOfStack(stackNum)] = 0;
	    pointer[stackNum]--;
	    return value;
	}
	
	public static int peek(int stackNum){
	    return stack[topOfStack(stackNum)];
	    
	}
	
	public static int topOfStack(stackNum){
	    return (stackNum * stackSize + pointer[stackNum]);
	}
	
	
}