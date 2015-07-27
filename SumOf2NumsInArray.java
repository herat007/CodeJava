

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumOf2NumsInArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {2,5,6,3,7,8,9};
		int sum = 11;
		
		Set<Integer> nums = new HashSet<Integer>();
		for(int i = 0; i<arr.length;i++){
			int min = sum - arr[i];
			if(nums.contains(min)){
				System.out.println("("+arr[i]+","+min+")");
			}
			else {
				nums.add(arr[i]);
			}
		}
	}
}