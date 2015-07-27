/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Maximum sum subsequence of non contiguos numbers*/
class MaximumSubSubsequence2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = {5,  5, 10, 40, 50, 35};
		
		System.out.println(sum(array));
		
	}
	
	public static int sum(int[] arr) {
        int[] sum = new int[arr.length];
        int i;

        for(i=0;i<arr.length;i++) {
                if(i==0) {
                        sum[0] = arr[0];
                }else if(i==1) {
                        sum[1] = Math.max(sum[0],arr[1]);
                }else{
                        sum[i] = Math.max(sum[i-2]+arr[i],sum[i-1]);
                }
        }    
        return sum[sum.length-1];
    }
}