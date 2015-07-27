/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Check if the given Binary tree is a Unival Tree or not */

class CheckUnivalTree {
    private static class Node {
	private int n;
	private Node left;
	private Node right;

	public Node(int n, Node left, Node right) {
	    this.n = n;
	    this.left = left;
	    this.right = right;
	}

	public boolean isUnival() {
	    if (this.left != null) {
    		if (this.left.n != this.n) {
    		    return false;
    		}
    		if (!this.left.isUnival()) {
    		    return false;
    		}
	    }

	    if (this.right != null) {
    		if (this.right.n != this.n) {
    		    return false;
    		}
    		if (!this.right.isUnival()) {
    		    return false;
    		}
	    }

	    return true;
	}

	public int countUnival() {
	    int count = 1;
	    if (this.left != null) {
    		if (this.left.n == this.n) {
    		    count++;
    		}
    		count += this.left.countUnival();
	    }
	    if (this.right != null) {
    		if (this.right.n == this.n) {
    		    count++;
    		}
    		count += this.right.countUnival();
	    }
	    if (this.left != null && this.right != null && this.left.n == this.n && this.right.n == this.n) {
		    count++;
	    }
	    return count;
	}
    }

public static void main(String args[]) {
    	Node left = new Node(1, null, null);
    	Node right = new Node(1, null, null);
    	Node root = new Node(1, left, right);
    	System.out.println(root.isUnival());
    	System.out.println(root.countUnival());
    }
}
