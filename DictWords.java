/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Given a dictionary of words and a string seperate the words in the string to create a space separated string */
class DictWords
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Set<String> dictionary = new HashSet<String>();
		dictionary.add("google");
		dictionary.add("is");
		dictionary.add("awesome");
		StringBuilder sb = new StringBuilder("isgoogleawesome");
		printWords2(sb, dictionary);
	}

public static void printWords2(StringBuilder sb, Set<String> dict) {

		StringBuilder currentWord = new StringBuilder();
		StringBuilder sentence = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			currentWord.append(sb.charAt(i));
			if (dict.contains(currentWord.toString())) {
				sentence.append(currentWord);
				currentWord.setLength(0);
				if(i !=sb.length()-1){
				    sentence.append(" ");
				}
			}
		}
		System.out.println(sentence);
    	}
}