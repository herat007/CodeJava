/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Check if two words is an anagrams or not. */
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Power(2,2) "+powerIter(2,-2));
		System.out.println("Power(3,2) "+powerRecur(3,2));
	}
	
	public static double powerIter(double x, int n){
	    
	    if(Double.isNaN(x))
	        return Double.NaN;
	        
	    if(n==0) return 1;
	    if(n==1) return x;
	    
	    if(n<0) return powerIter(1/x,-n);
	    
	    double result = 1;
	    
	    while(n>0){
	        if(n%2 != 0){
	            result = result * x;
	            n = n-1;
	        }
	        
	        x = x*x;
	        n = n/2;
	    }
	    
	    return result;
	}
	
	public static double powerRecur(double x,int n){
       if(Double.isNaN(x))
            return Double.NaN;
        
        if(n<0) return powerRecur(1/x,-n);
        
        if(n==0) return 1;
        if(n==1) return x;
        
        if(n%2 == 0){
            return powerRecur(x*x,n/2);
        }
        else {
            return x * powerRecur(x*x, (n-1)/2);
        }
	}
}