/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* 
Compute the Fibonacci series both recursively and iteratively.
*/
class DuplicateSortedArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   // 	int[] a= {0,1,2,2,3,4,5,6,7,8,9,10};
	   int[] a ={0,1,1,2};
	    	System.out.println(DuplicateBinaryFind(a,0,a.length-1));
    }

public static int DuplicateBinaryFind(int[] input, int left, int right)
{
   int dup =0;

//   if(left==right)
//   {
//       dup = left;
//   }
//   else
//   {
        int midIndex = left + (right-left)/2;
        if(input[midIndex] == midIndex)
        {
                // evaluate current location with its right neighbor
                if (input[midIndex] == input[midIndex + 1])
                {
                    return midIndex;
                }

                // fork right
                 dup = DuplicateBinaryFind(input,midIndex, right);
        }
        else
        {
           if (input[midIndex] == input[midIndex - 1])
                {
                    return midIndex;
                }

                // fork left
                dup = DuplicateBinaryFind(input,left, midIndex);
        }
   return dup;

}
}