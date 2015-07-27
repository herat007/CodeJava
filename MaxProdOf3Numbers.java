/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Write a program maximum product using 3 numbers*/
class MaxProdOf3Numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] nums = new int[]{1,-4,-4,1,3,2};
	    int[] myArr = new int[]{0,0,0,0,0};
	    
	    for(int n: nums){
	        
	        if(n>=myArr[0]){
	            myArr[2] = myArr[1];
	            myArr[1] = myArr[0];
	            myArr[0] = n;
	        }
	        else if(n>=myArr[1]){
	            myArr[2] = myArr[1];
	            myArr[1] = n;
	        }
	        else if(n>=myArr[2]){
	            myArr[2] = n;
	        }
	        else if(n<=myArr[4]){
	            myArr[3] = myArr[4];
	            myArr[4] = n;
	        }
	        else if(n<= myArr[3]){
	            myArr[3] = n;
	        }
	        
	    }
	    
	    System.out.println(Math.max((myArr[0]*myArr[1]*myArr[2]),(myArr[0]*myArr[3]*myArr[4])));
	    
	}
}