/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Write a program to convert string num to int */
class ThreeNumSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] array = new int[]{0,2,-2,-3,4};
	    Arrays.sort(array);
	    
	    for(int i = 0; i<array.length; i++){
	        int j = i+1;
	        int k = array.length - 1;
	        
	        while(k>=j){        
	            
	            if(array[i] + array[j] + array[k] == 0){
	                System.out.println(array[i]+","+array[j]+","+array[k]);
	                return;
	            }
	            
	            if(array[i] + array[j] + array[k] > 0) k--;
	            else j++;
	        }
	    }
	}
}