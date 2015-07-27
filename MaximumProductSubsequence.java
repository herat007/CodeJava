/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Maximum product subsequence. Assumption that product is always greater than or equal to 1 */
class MaximumProductSubsequence
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//int[] array = {-2,1,-3,4,-1,2,1,-5,4};
	    int[] array = {2,3,-1,4};
		int max = 1;

		int currentMax = 1;
		int min = 1;
		
		for(int i = 0; i<array.length;i++){
		    if(array[i] > 0) {
		        max = max * array[i];
		        min = Math.min(min * array[i],1);
		    }
		    else if (array[i] < 0){
		        int temp = max;
		        max = Math.max(1, min * array[i]);
		        min = temp*array[i];
		    }
		    else {
		        max = 1;
		        min = 1;
		    }
		    
		    if(currentMax < max){
		        currentMax = max;
		    }
		    
		}
		
		System.out.println("Maximum product : "+currentMax);
		
		
	}
}