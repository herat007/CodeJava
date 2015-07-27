import java.util.*;
import java.lang.*;
import java.io.*;

/*# no duplicate triplets
# non-descending order in each triplet

// -4,-1,2 = -3
//-4,-1,2 = -3
//-4,0, 2 = -2
*/

class TripletSum {
    public static void main(String[] args){
    
        int[] array = {-1,0,1,2,-1,-4};
        
        Arrays.sort(array); // {-4,-1,-1,-1,0,0,1,2}
        Set<List<Integer>> list = new HashSet<List<Integer>>();
        for(int i = 0; i<array.length; i++){
            int j = i+1;
            int k = array.length-1;
                System.out.println("i : "+i+" j : "+j);
            while(k>=j && k !=j){
                int sum = array[i]+array[j]+array[k];
                if(sum == 0){                 
                    System.out.println("----");
                     System.out.println("i : "+i+" j : "+j+" k : "+k);
                     List<Integer> temp = new ArrayList<Integer>();
                     temp.add(array[i]);
                     temp.add(array[j]);
                     temp.add(array[k]);
                     System.out.println(temp);
                     list.add(temp);
                }
                
                if(sum >0) {
                    k--;
                }
                else{
                    j++;
                }
                
            }
        }
        System.out.println(list);
    }
}