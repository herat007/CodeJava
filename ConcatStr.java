/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* In a given array of strings and a function to concatinate 2 strings , combine all the strings 
    such that their cost is minimum . For eg str = ["abc","d","wxyz"] answer is "dabcwxyz"
*/
class ConcatStr
{
	public static void main(String[] args) {
		String[] strArray = {"abc","sddsfd","fedsa","w","rrgdsff"};
		// TODO Auto-generated method stub
			int minCost = calculateMinimumConcatCost(strArray);
			System.out.println(minCost);
			int[] arry = {3,-1,-1,2,-4,-2,2,1};
			Arrays.sort(arry);
			for(int i =0;i<arry.length;i++){
				System.out.println(arry[i]);
			}
	}
	
	private static int calculateMinimumConcatCost(String [] arr){
		Arrays.sort(arr, new StringLengthComparator());
		
		int cost = 0;
		int totalCumulativeCost = 0;
		StringBuilder sb = new StringBuilder(arr[0]);
		for(int i = 1;i < arr.length;++i){
			sb.append(arr[i]);
			cost = sb.length();
			totalCumulativeCost = totalCumulativeCost + cost;
		}
        System.out.println(sb.toString());
		return totalCumulativeCost;
	}
	
	private static class StringLengthComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
		int o = o1.length() - o2.length();
			return o;
		}
		
	}
}