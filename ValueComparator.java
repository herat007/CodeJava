import java.util.*;
import java.lang.*;
import java.io.*;

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