/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Buy stocks and sell it at a profit */
class StockMarket
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] prices = {2,4,1,5,2,6,8,9,10,5};
	    
	    int profit1 = stock1(prices);
	    System.out.println(profit1);
	    
	}
	
	/** Say you have an array for which the ith element is the price of a given stock on day i.

        If you were only permitted to complete at most one transaction 
        (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
        **/
	public static int stock1(int[] prices){
	    int curentProfit = prices[0];
	    int min = prices[0];
	    int profit = prices[0];
	    for(int i = 1; i<prices.length; i++){
	        curentProfit = prices[i] - min;
	        
	        if(profit <=curentProfit){
	            profit = curentProfit;
	        }
	        else {
	            min = prices[i];	   
	            curentProfit = min;
	        }
	        
	    }
	    return profit;
	    
	} 
}