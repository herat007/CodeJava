import java.util.*;
import java.lang.*;
import java.io.*;

/* Check if a String has unique characters or not (with and without datastructures */
class UniqueChar
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String inputStr = "abcda";
// 		if(args[0] != null){
// 		    inputStr = args[0];
// 		}
		
		// with additional datastructure 
		if(withAdditionalDataStructure(inputStr)){
		    System.out.println("String is unique");
		}
		else {
		    System.out.println("String is NOT unique");
		}
		
		// without additional datastructure 
		if(withoutAdditionalDataStructure(inputStr)){
		    System.out.println("String is unique");
		}
		else {
		    System.out.println("String is NOT unique");
		}
	}
	
	/**
	 * If you dont want to use a set then define a Boolean array of 256 length
	 **/
	public static boolean withAdditionalDataStructure(String str){
	    Set<Character> charSet = new HashSet<Character>();
	    
	    for(int i = 0 ; i<str.length(); i++){
	       Character c = str.charAt(i);
	       if(charSet.contains(c)){
	           return false;
	       }
	       else {
	           charSet.add(c);
	       }
	    }
	    return true;
	    
	}
	
	/**
	 * We will assume, in the below code, that the string only uses the lowercase letters a through 
	 * 
	 * 
	 **/
	public static boolean withoutAdditionalDataStructure(String str){
	    int checker = 0;
	
	    for(int i = 0; i<str.length(); i++){
	        int val = str.charAt(i) - 'a';
	        if((checker & (1 << val)) > 0){
	            return false;
	        }
	        checker |= (1<< val);
	    }
	    return true;
	}
}