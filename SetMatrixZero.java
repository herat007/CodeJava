/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0. */
class SetMatrixZero
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[][] matrix =new int[][] {
	        {1,2,3,4,5,0,9},
	        {0,3,4,5,6,3,0},
	        {4,5,6,7,9,3,2},
	        {2,0,5,6,6,7,8}
	    } ;
	    boolean[] row = new boolean[matrix.length];
	    boolean[] col = new boolean[matrix[0].length];
	    
	    for(int i =0 ; i<matrix.length; i++){
	        for(int j = 0; j<matrix[0].length; j++){
	            if(matrix[i][j] == 0){
	                row[i] = true;
	                col[j] = true;
	            }
	        }
	    }
	    
	    for(int i =0 ;i<matrix.length;i++){
	        for(int j = 0; j<matrix[0].length;j++){
	            if(row[i] || col[j]){
	                matrix[i][j] =0;
	            }
	        }
	    }
	    
	    for(int i =0 ;i<matrix.length;i++){
	        for(int j = 0; j<matrix[0].length;j++){
	            System.out.print(matrix[i][j]+ " ");
	        }
	        System.out.println();
	    }
	}
}