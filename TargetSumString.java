/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*  */
class TargetSumString
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    String num = "1234";
	    int sum = 7;
		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		
		for(int i = 0; i<num.length(); i++){
		    char c = num.charAt(i);
		    int a = c - '0';
		    if(map1.containsKey(a)){
		        int value = map1.get(a);
		        map1.put(a,value+1);
		    }
		    else {
		        map1.put(a,1);
		    }
		}
		int count = 1;
		
		for(int i =0; i<num.length()-1; i++){
		    
		    int b = num.charAt(i) - '0';
		    int diff = sum - b;
		    
		    if(map1.containsKey(diff) && map1.get(diff) > 1){
		        count++;
		        break;
		    }
		    else {
		        sum = diff;
		    }
		    
		    if(count == map1.size()-1 && sum != 0){
		           count = 0;
		           break;
		    }
		    count++;
		}
		System.out.println("count "+count);
	}
	
	
}
