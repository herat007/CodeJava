/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Given an array of integers in a sorted array with multiples. Give the unique numbers. With space as O(1) 
    time as O(n)
*/
class UniqueNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] =
        {1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 6, 6, 6,7,7,7,8,8,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
    int j = 1;
    for (int i = 1; i < a.length; i++) {
      if (a[i - 1] != a[i]) {
        a[j] = a[i];
        j++;
      }
    }

    for (int k = 0; k < j; k++) {
      System.out.print(a[k] + ", ");
    }
  }
}