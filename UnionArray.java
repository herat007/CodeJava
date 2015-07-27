/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*
Union of 2 unique arrays such that they are in sorted order
*/
class UnionArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] A = {1, 3, -1, 2, 4}; // -1,2,3
		int[] B = {5, 1, -1, 6, 8}; // -3,-2,-1
		
		Arrays.sort(A);
		Arrays.sort(B);
		int i =0;
		int j = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		while(i<A.length && j<B.length){
		    if(A[i] > B[j]){
		        list.add(B[j]);
		        j++;
		    }
		    else if(A[i] == B[j]){
		        list.add(A[i]);
		        i++;
		        j++;
		    }
		    else{
		        list.add(A[i]);
		        i++;
		    }
		}
		
		if(i<A.length-1){
		    for(int k = i; k<A.length;k++){
		        list.add(A[k]);
		    }
		}
		
		if(j<B.length-1){
		    for(int k = j; k<B.length;k++){
		        list.add(B[k]);
		    }
		}
		System.out.println("Output list => "+list);
	}
	
}