/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Check if the strings are IsomorphicStrings */
class IsomorphicStrings
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1 = "ab";
		String s2 = "ca";
		
		if(s1.length() != s2.length()){
		    System.out.println("String is not isomorphic..");
		    return;
		}
		
		Map<Character,Character> map1 = new HashMap<Character,Character>();
		Map<Character,Character> map2 = new HashMap<Character,Character>();
		
		for(int i = 0; i<s1.length();i++){
		    char c1 = s1.charAt(i);
		    char c2 = s2.charAt(i);
		    
		    if(map1.containsKey(c1)){
		        char a = map1.get(c1);
		        if(a != c2){
		            System.out.println("String is not isomorphic.. ");
		            return;
		        }
		    }
		    if(map2.containsKey(c2)){
		        char a = map2.get(c2);
		        if(a != c1){
		            System.out.println("String is not isomorphic.. ");
		            return;
		        }
		    }
		    map1.put(c1,c2);
		    map2.put(c2,c1);
		}
		
		System.out.println("String is isomorphic");
	}
	
	
}