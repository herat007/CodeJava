/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Write a program to convert integer to ascii */
class Itoa
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int number = 3045;
	    String s = "";
		boolean negative = false;
		if(number < 0){
		    negative = true;
		    number = 0 - number;
		}
		else if( number == 0){
		    System.out.println("O");
		}
		
		while(number != 0){
		    s = (char)(48 + (number % 10)) + s;
		    number = number/10;
		}
		
		if(negative) s = "-"+s;
		
		System.out.println(s);
	}
}