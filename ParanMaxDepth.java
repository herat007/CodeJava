/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Write a program to convert string num to int */
class ParanMaxDepth
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String str = "abc(123(xyz))m(((n)))o";
	    int max = 0;
	    int count = 0;
	    for(int i = 0; i<str.length(); i++){
	        if(str.charAt(i) == '('){
	            count++;
	            if(count > max){
	                max = count;
	            }
	        }
	        else if(str.charAt(i) == ')'){
	            count--;
	        }
	    }
	    System.out.println("count : "+max);
	}
}