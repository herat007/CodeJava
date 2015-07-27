/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* 
Compute the Fibonacci series both recursively and iteratively.
*/
class Fibonnaci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 10;
		
		System.out.println("Fibonacci Recursive : "+fibonacciRecursive(4));
		System.out.println("Fibonacci Iterative : "+fibonacciIterative(10));
    }
    
    public static int fibonacciRecursive(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }
    
    public static int fibonacciIterative(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 1;
        for(int i = 3; i<= num; i ++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        
        return fibonacci;
    }
}