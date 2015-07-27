/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Describe how you could usea single array to implement three stacks. */
public class StringTokenizer
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String inputString = args[0];
	    System.out.println(inputString);
	    int number = Integer.parseInt(args[1]);
	    String delims = "[ .!@#$%^&\\(\\)\\n\\r]+";
	    String[] tokens = inputString.split(delims);
	    Map<String,Integer> freqStrs = new HashMap<String,Integer>();
	    for(String t : tokens){
	        System.out.println(t);
	        if(freqStrs.containsKey(t)){
	            int val = freqStrs.get(t);
	            freqStrs.put(t,val+1);
	        }
	        else{
	            freqStrs.put(t,1);
	        }
	        
	    }
	    System.out.println(freqStrs);
	    List<String> topK = new ArrayList<String>();
	    topK = getTopKFrequentlyOccurringStrs(freqStrs,number);
	    System.out.println(topK);
	}
	
	public static List<String> getTopKFrequentlyOccurringStrs(Map<String,Integer> freqStrs, int k){
	    Map<String,Integer> sortedMap = new TreeMap<String,Integer>(new ValueComparator(freqStrs));
	    
	    sortedMap.putAll(freqStrs);
	    System.out.println(sortedMap);
	    List<String> topK = new ArrayList<String>();
	    int count = 0;
	    for(String s: sortedMap.keySet()){
	        
	        if(k > count)
	            topK.add(s);
	        else
	            break;
	        count++;
	    }
	    return topK;
	}
	
}

class ValueComparator<String> implements Comparator<String> {
 
	Map<String,Integer> map;
 
	public ValueComparator(Map<String,Integer> map) {
		this.map = map;
	}
 
	public int compare(String key1, String key2) {
		Integer val1 =  map.get(key1);
		Integer val2 =  map.get(key2);
		int compare = val2.compareTo(val1);
		if (compare == 0) 
          return 1;
        else 
          return compare;
	}
}






