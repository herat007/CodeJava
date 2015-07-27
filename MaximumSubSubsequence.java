/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Maximum sum subsequence */
class MaximumSubSubsequence
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = {-2,1,-3,4,-1,2,1,-5,4};
		
		int max = 0;
		int start = 0;
		int end = 0;
		int currentMax = 0;
		
		for(int i = 0; i<array.length;i++){
		    currentMax = currentMax + array[i];
		    if(currentMax > max) {
		        max = currentMax;
		        end = i;
		    }
		    
		    else if(currentMax < 0){
		        currentMax = 0;
		        start = i+1;
		    }
		}
		
		System.out.println("max : "+max+" start: "+start+" end: "+end);
		
	}
}