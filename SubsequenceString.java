/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*
Find the subsequence of a string. 
even if we remove some characters
*/
class SubsequenceString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String A ="absdefgh";
		String B = "asdf";
		int i = 0,j=0;
		if(A.length() < B.length()){
		    System.out.println("Wrong inputs");
		}
		
		while(i<A.length() && j <B.length()){
		    if(A.charAt(i) == B.charAt(j)){
		        i++;
		        j++;
		    }
		    else{
		        i++;
		    }
		}
		
		if(j == B.length()){
		    System.out.println("Its a subsequence");
		}
		
		else{
		     System.out.println("Its NOT a subsequence");
		}
		
		
	}
	
}