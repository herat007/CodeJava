import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* This class will be given a list of words (such as might be tokenized
 * from a paragraph of text), and will provide a method that takes two
 * words and returns the shortest distance (in words) between those two
 * words in the provided text. 
 
 * Example:
 * WordDistanceFinder finder = new WordDistanceFinder(Arrays.asList("the", "quick", "brown", "fox", "quick"));
 * assert(finder.distance("fox","the") == 3);
 * assert(finder.distance("quick", "fox") == 1);
*/

public class WordDistanceFinder {

 List<String> list = new ArrayList<String>();
 WordDistanceFinder(List<String> list){
  if(list == null){
   throw new RuntimeException("Input List is null");
  }
  this.list = list;
 }
 
 private int distance(String s1, String s2){
  if(s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0){
   return -Integer.MAX_VALUE;
  }
  
  if(s1 == s2){
   return 0;
  }
  
  int s1Index = -1;
  int s2Index = -1;
  int minDistance = Integer.MAX_VALUE;
  int size = list.size(); 
  int localDistance = Integer.MAX_VALUE;
  for(int index = 0; index < size; index++){
   String word = list.get(index);
   if(word.equals(s1)){
    s1Index = index;
   }
   else if(word.equals(s2)){
    s2Index = index;
   }
   if((word.equals(s1) || word.equals(s2)) && s1Index != -1 && s2Index != -1){
    localDistance = Math.abs(s1Index - s2Index);
    minDistance = Math.min(localDistance, minDistance);
   } 
  }
  return minDistance;
 }
 
 
 public static void main(String[] args) {
  WordDistanceFinder finder = new WordDistanceFinder(Arrays.asList("the", "quick", "brown", "fox", "quick"));
  System.out.println(finder.distance("fox","the"));
  System.out.println(finder.distance("fox","quick"));
 }
}