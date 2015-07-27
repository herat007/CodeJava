/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Describe how you could usea single array to implement three stacks. */
class SelectionOfTopK
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array ={4,6,7,4,9,1,2,9,0};
		int k =4;
		int maxIdx = 0;
		int maxValue = 0;
		for(int i=0;i<k;i++){
            maxIdx = i;
            maxValue = array[i];
            for(int j= i+1; j<array.length; j++){
                if(array[j] > maxValue){
                    maxIdx = j;
                    maxValue = array[j];
                }
            }
            int temp = array[i];
            array[i] = array[maxIdx];
            array[maxIdx] = temp;
		}
		
		for(int i = 0 ;i <k;i++){
		    System.out.println(array[i]);
		}
	}
	
	
}