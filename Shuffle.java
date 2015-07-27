/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Shuffle algorithm .. Fisher-Yates shuffle */
class Shuffle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] array ={1,2,3,4,5,6,7,8,9,10};
		shuffle(array);
		
		for(int i = 0;i<array.length;i++){
		    System.out.println(array[i]);
		}
	}
	
	public static void shuffle(int[] array){
	    for(int i =0; i<array.length;i++){
	        int r = random(i , array.length-1);
	        swap(array,i,r);
	    }
	}
	
	public static int random(int rangeStart,int rangeEnd){
	    return rangeStart + (int)(Math.random() *((rangeEnd - rangeStart) +1));
	}
	
	public static void swap(int[] array,int i,int r){
	    int temp = array[i];
	    array[i]= array[r];
	    array[r] = temp;
	}
}
