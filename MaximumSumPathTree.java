import java.io.*;
public class MaximumSumPathTree {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        TreeNode l5 = new TreeNode(1,null,null);
        TreeNode r5 = new TreeNode(20,null,null);
        TreeNode l4 = new TreeNode(5,null,null);
        TreeNode r4 = new TreeNode(100,null,null);
        TreeNode l2 = new TreeNode(1,l4,r4);
        TreeNode r2 = new TreeNode(5,null,null);
        TreeNode l3 = new TreeNode(2,l5,null);
        TreeNode r3 = new TreeNode(4,null,r5);
        TreeNode l1 = new TreeNode(3,l2,r2);
        TreeNode r1 = new TreeNode(8,l3,r3);
        TreeNode root = new TreeNode(6,l1,r1);
        
        int max = maxSum(Integer.MIN_VALUE,root);
        
        System.out.println(max);

    }
    
    public static int maxSum(Integer max,TreeNode root){
    
        if(root == null) {
            return 0;
        }

        int left = maxSum(max,root.left);
        int right = maxSum(max,root.right);

        int curr = Math.max(root.val,Math.max(root.val+left,root.val+right));
        
        max = Math.max(max,Math.max(curr,left+root.val+right));
        
        return curr;
    }    
    
    private static class TreeNode {
    
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int v, TreeNode l, TreeNode r){
            val = v;
            left = l;
            right = r;
        }
    }
}

