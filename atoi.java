/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Write a program to convert string num to int */
class atoi
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s= "367";
	    
	    if(s == null || s.isEmpty()){
	        System.out.println("Invalid input!!!");
	    }
	    
	    char first = s.charAt(0);
	    boolean negative = false;
	    int endIdx = 0;
	    if(first == '-'){
	        negative = true;
	        endIdx = 1;
	    }
	    
	    int factor = 1;
	    char c;
	    int result = 0;
	    for(int i=s.length()-1 ; i>=endIdx ;i--){
	        char b = s.charAt(i);
	        
	        int a = b - '0';
	        
	        if(a < 0 || a>9){
	            System.out.println("Invalid Input!!");
	            break;
	        }
	        
	        result += factor*a;
	        factor = factor*10;
	    }
	    
	    if(negative){
	        result = -1*result;
	    }
	    
	    System.out.println("Result : "+result);
	}
}