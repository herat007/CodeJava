/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Find the LowestCommonAncestor of 2 nodes for a Binary search tree. */
class LowestCommonAncestorBST
{
    public static void main (String[] args) throws java.lang.Exception
	{
		TreeNode root = new TreeNode(60);
		TreeNode n1 = new TreeNode(41);
		TreeNode n2 = new TreeNode(74);
		root.left = n1;
		root.right = n2;
		TreeNode n3 = new TreeNode(16);
		TreeNode n4 = new TreeNode(53);
		n1.left = n3;
		n1.right = n4;
		TreeNode n5 = new TreeNode(65);
		n2.left = n5;
		TreeNode n7 = new TreeNode(25);
		TreeNode n8 = new TreeNode(46);
		TreeNode n9 = new TreeNode(55);
		n3.right = n7;
		n4.left = n8;
		n4.right = n9;
		TreeNode n10 = new TreeNode(63);
		TreeNode n11 = new TreeNode(70);
		n5.left = n10;
		n5.right = n11;
		TreeNode n12 = new TreeNode(62);
		TreeNode n13 = new TreeNode(64);
		n10.left = n12;
		n10.right = n13;
		
		TreeNode lca1 = findLCABST(root,n12,n2);
		System.out.println("LCA BST : "+lca1.data);
	}
	
	public static TreeNode findLCABST(TreeNode root, TreeNode a, TreeNode b){
	    if(root == null|| a == null || b == null){
	        return null;
	    }
	    
	    if(Math.max(a.data,b.data) < root.data)
	        return findLCABST(root.left,a,b);
	    else if(Math.min(a.data,b.data) > root.data)
	        return findLCABST(root.right,a,b);
	    else
	        return root;
	}
}