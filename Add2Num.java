/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Write a program to add 2 numbers with bitwise operators */
class Add2Num
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int a = 10,b=10;
	    
	    while(b!=0){
	        int carry = (a & b);
	        a = a ^b;
	        
	        b = carry << 1;
	    }
	    
	    System.out.println("Sum : "+a);
	}
}