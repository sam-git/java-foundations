//********************************************************************
//  PalindromeTester2.java       Java Foundations
//
//  Demonstrates the use of nested while loops.
//  Just like PalindromeTester but has better comments added.
//********************************************************************

import java.util.Scanner;

public class PalindromeTester2
{
   //-----------------------------------------------------------------
   //  Tests strings to see if they are palindromes.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String str, another = "y";
      int left, right;

      Scanner scan = new Scanner (System.in);

      while (another.equalsIgnoreCase("y")) // allows y or Y
      {
         int[] chars = new int[9999];
         int count = 0;
         System.out.println ("Enter a potential palindrome:");
         str = scan.nextLine();
         str = str.toLowerCase();
         
         //find locations in the palindrome string with non alphabet characters and store their location in chars[] array.
         for (int i = 0; i < str.length(); i++)
         {
            if (str.charAt(i) < 97 || str.charAt(i) > 122) 
            {
                chars[count] = i;
                count++;
            }
         }
         
         //starting with highest char position recorded in char[] array, remove each non alphabet character from the palindrome string.
         for(int i = count - 1; i >= 0; i --)
         {
            str = str.substring(0,chars[i]) + str.substring(chars[i]+1,str.length());
         }
          
	//print out the palindrome string with all non alphabet characters removed. This is what will be tested to see if it is a palindrome.        
         System.out.println(str);

	//Palindrome test
         left = 0;
         right = str.length() - 1;

         while (str.charAt(left) == str.charAt(right) && left < right)
         {
            left++;
            right--;
         }

         System.out.println();

         if (left < right)
            System.out.println ("That string is NOT a palindrome.");
         else
            System.out.println ("That string IS a palindrome.");

         System.out.println();
         System.out.print ("Test another palindrome (y/n)? ");
         another = scan.nextLine();
      }
   }
}
