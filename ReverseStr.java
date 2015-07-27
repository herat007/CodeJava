/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Reversing a string
*/
class ReverseStr
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String inputStr = "herat";
	    int j = inputStr.length() - 1;
	    char[] charArray = inputStr.toCharArray();
	    for(int i = 0; i <inputStr.length() ;i++){
	        
	        char temp = charArray[i];
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        
	        j--;
	        if(i >=j){
	            break;
	        }
	    }
	    System.out.println(String.valueOf(charArray));
    }
}