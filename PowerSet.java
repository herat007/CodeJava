import java.util.*;

public class PowerSet {
 public static void main(String[] args) {
  String st[] = { "a", "b", "c" };
  HashSet<HashSet<String>> outputHashSet = new HashSet<HashSet<String>>();
  int length = st.length; // 3
  int expectedElements = (int) Math.pow(2, length); // 2^n = 8
  
  for (int i = 0; i < expectedElements; i++) {
   String str = Integer.toBinaryString(i); // 0
   System.out.println(str);
   int strLength = str.length(); 
   String pset = str;
   for (int k = strLength; k < length; k++) {
    pset = "0" + pset; // make str of length: length by appending 0 in front 
   }
   System.out.println(pset);
   HashSet<String> innerSet = new HashSet<String>();
   for (int j = 0; j < pset.length(); j++) {
    if (pset.charAt(j) == '1')
     innerSet.add(st[j]);
   }
   outputHashSet.add(innerSet);
   System.out.println(innerSet.toString());
  }
  System.out.println(outputHashSet.toString().replace("[", "{").replace("]","}"));
 }
}