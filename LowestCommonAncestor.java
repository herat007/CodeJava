/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Find the LowestCommonAncestor of 2 nodes. */
class LowestCommonAncestor
{
    public static void main (String[] args) throws java.lang.Exception
	{
		TreeNode root = new TreeNode(2);
		TreeNode n1 = new TreeNode(5);
		TreeNode n2 = new TreeNode(2);
		root.left = n1;
		root.right = n2;
		TreeNode n3 = new TreeNode(2);
		TreeNode n4 = new TreeNode(6);
		n1.left = n3;
		n1.right = n4;
		TreeNode n5 = new TreeNode(9);
		TreeNode n6 = new TreeNode(4);
		n2.right = n5;
		n5.left = n6;
		TreeNode n7 = new TreeNode(5);
		TreeNode n8 = new TreeNode(11);
		n4.left = n7;
		n4.right = n8;
		
		TreeNode lca1 = findLCA(root,n4,n5);
		System.out.println("LCA "+lca1.data );
	}
	
	public static TreeNode findLCA(TreeNode root, TreeNode a, TreeNode b){
	    if(root == null){
	        return null;
	    }
	    
	    if(root.data == a.data || root.data == b.data)
	    {    
	        return root;
	    }
	    
	    TreeNode l = findLCA(root.left,a,b);
	    TreeNode r = findLCA(root.right,a,b);
	    
	    if(l!= null || r!= null){
	        return root;
	    }
	    
	    return (l!=null?l:r);
	}
}