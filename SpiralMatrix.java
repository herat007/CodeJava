import java.io.*;
public class SpiralMatrix {
    public static void main(String args[] ) throws Exception {
        int[][] array={{1,2,3},
                  {4,5,6},
                {7,8,9}};
        
        int rowL = array.length;
        int colL = array[0].length;
        int r=0,c=0;
        int count = 0;
        while(rowL > 0 && colL > 0){
            if(rowL==1){
                for(int i=0; i<rowL; i++){
                    System.out.println(array[r][c++]);
                }
                break;
            }else if(colL==1){
                for(int i=0; i<colL; i++){
                   System.out.println(array[r++][c]);
                }
                break;
            }
           for(int i = 0; i<colL -1; i++){
               System.out.println(array[r][c++]);
               count++;
           }
            for(int i = 0; i<rowL -1; i++){
                System.out.println(array[r++][c]);
                count++;
            }
            for(int i = 0; i<colL -1; i++){
                System.out.println(array[r][c--]);
                count++;
            }
            for(int i =0;i<rowL-1;i++){
                System.out.println(array[r--][c]);
                count++;
            }
            
            r++;
            c++;
            rowL = rowL - 2;
            colL = colL - 2;
                
        }
        
    }
}