/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RearrangeToGetLargestNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		long num = 8754365;
		int[] numArray = new int[10];
		Arrays.fill(numArray,0);
		
		while(num % 10 !=0){
			int rem = (int)num % 10;
			numArray[rem]++;
			num = num /10;
			
		}
		long result = 0;
		String str = "";
		for(int i = numArray.length-1; i>=0;i--){
			while(numArray[i] !=0){
				str += String.valueOf(i);
				numArray[i]--;
			}
		}
		result = Integer.parseInt(str);
		System.out.println(result);
	}
}