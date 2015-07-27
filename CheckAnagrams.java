/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Check if two words is an anagrams or not. */
class CheckAnagrams
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String anagram1 = "secure";
		String anagram2 = "rescue";
		
		Map<Character,Integer> occurrence = new HashMap<Character,Integer>();
		if(anagram1.length() != anagram2.length()){
			System.out.println("NOT ANAGRAMS!!");
			return;
		}
		for(int i = 0; i<anagram1.length();i++){
			Character c = anagram1.charAt(i);
			if(occurrence.containsKey(c)) {
				Integer o = occurrence.get(c);
				o= o+1;
				occurrence.put(c,o);
			}
			else {
				occurrence.put(c,1);
			}
		}

		for(int j= 0;j<anagram2.length();j++){
			Character c = anagram2.charAt(j);
			if(occurrence.containsKey(c)){
				Integer o = occurrence.get(c);
				o = o - 1;
				if(o == 0){
					occurrence.remove(c);
				}
				else {
					occurrence.put(c,o);
				}
			}
		}
		
		if(occurrence.isEmpty()){
			System.out.println("IT IS AN ANAGRAM");
		}
		else {
			System.out.println("IT IS NOT AN ANAGRAM");
		}
	}
}