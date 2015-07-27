/*
    Find the next palindrome for the number. Algo:
    1) If the number of digits is even, say abcdef
        a) We reverse the first half cba
        b) Compare cba and def. If cba> def then number is abccba
        c) Else Increment abc+1 = xyz. Then number is xyzzyx.
    2) If the number of digits are odd abcdefg . 
        a) Divide number into 3 parts abc d efg.
        b) If cba > efg then the number is abcdcba
        c) Else increment abcd+1=wxyz and  the number is wxyzyxw
*/

public class NextPalindrome
{
 public static void main(String[] args)
 {
  System.out.println(nextPalindrome(999));
 }
 public static int nextPalindrome(int num)
 {
  return nextPalindrome(num,true);
 }
 private static int nextPalindrome(
    int num,boolean firstTime)
 {
  String numString=""+num;
  int leftEndIndex=-1;
  int rightStartIndex=-1;
  boolean isOdd=numString.length()%2==1;
  if(isOdd)
  {
   leftEndIndex=numString.length()/2;
   rightStartIndex=leftEndIndex+1;
  }
  else
  {
   leftEndIndex=rightStartIndex=numString.length()/2;
   
  }
  String leftHalf=numString.substring(0,leftEndIndex);
  String rightHalf=numString.substring(rightStartIndex);
  
  String leftReversed=new StringBuffer(leftHalf).
    reverse().toString();
  String palindrome=null;
  if(Integer.parseInt(leftReversed)>Integer.parseInt
    (rightHalf)||!firstTime)
  {
   if(isOdd)
    palindrome=leftHalf+numString.charAt(leftEndIndex)+
    leftReversed;
   else
    palindrome=leftHalf+leftReversed;
   return Integer.parseInt(palindrome);
  }
  else
  {
   if(isOdd)
   {
    String leftAndMiddle=leftHalf+numString.charAt(
    leftEndIndex);
    int incrementedLeft=Integer.parseInt(leftAndMiddle)+1;
    return nextPalindrome(Integer.parseInt(incrementedLeft+
    rightHalf),false);
   }
   else
   {
    int incrementedLeft=Integer.parseInt(leftHalf)+1;
    return nextPalindrome(Integer.parseInt(incrementedLeft+
    rightHalf),false);
   }
  }
  
 }
}