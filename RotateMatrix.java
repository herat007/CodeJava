public class RotateMatrix {

 public static void main(String[] args){
  int[][] array={{1,2,3},
                  {4,5,6},
                {7,8,9}};
                
                rotate(array,3);
 }
 
public static void rotate(int[][] matrix, int n) {
    for (int layer = 0; layer < n / 2; ++layer) {
        int first =layer;
        int last = n - 1 - layer;
        for(int i = first; i < last; ++i) {
            int offset = i - first; // savetop
            int top = matrix[first][i];
            // left -> top
            matrix[first][i] = matrix[last-offset][first];
            // bottom -> left
            matrix[last-offset][first] = matrix[last][last - offset];
            // right -> bottom
            matrix[last][last - offset] = matrix[i][last];
            // top -> right
            matrix[i][last] = top;
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