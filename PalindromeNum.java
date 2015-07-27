/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Write a program to find a palindrome num*/
class PalindromeNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    int num = 21212;
	    int div = 1;
	    
	    while(num/div >=10){
	        div = div*10;
	    }
	    
	    while(num != 0){
	        int l = num/div;
	        int r = num%10;
	        if(l!=r) {
	            System.out.println("Not a palindrome");
	            return;
	        }
	        num = num%div;
	        num = num/10;
	        div = div/100;
	    }
	    
	    System.out.println("Palindrome");
	}
}