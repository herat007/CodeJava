/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Implement a method to perform basic string compression using the counts of
repeated characters. For example, the string aabcccccaaa would become
a2blc5a3. If the "compressed" string would not become smaller than the original
string, your method should return the original string */
class CompressString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "aabbcdd";
		
		System.out.println(checkCount(str));
		if(checkCount(str) == str.length()){
		    System.out.println(str);
		    return;
		}
		int count = 1;
		char last = str.charAt(0);
		StringBuffer buffer = new StringBuffer();
		for(int i= 1; i< str.length(); i++){
		    if(last == str.charAt(i)){
		        count ++;
		    }
		    else {
		        buffer.append(last);
		        buffer.append(count);
		        count =1;
		        last = str.charAt(i);
		    }
		}
		buffer.append(last);
		buffer.append(count);
		
		System.out.println(buffer.toString());
	}
	
	public static int checkCount(String str) {
	    int count = 1;
	    char last = str.charAt(0);
	    
	    for(int i = 1; i<str.length(); i++){
	        if(last != str.charAt(i)){
	            count++;
	            last = str.charAt(i);
	        }
	        else {
	            return -1;
	        }
	    }
	    return count;
	}
}