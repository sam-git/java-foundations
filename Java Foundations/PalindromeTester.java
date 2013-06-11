//********************************************************************
//  PalindromeTester.java       Java Foundations
//
//  Demonstrates the use of nested while loops.
//********************************************************************

import java.util.Scanner;

public class PalindromeTester
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
         
         //find locations in string with non alphabet characters.
         for (int i = 0; i < str.length(); i++)
         {
            if (str.charAt(i) < 97 || str.charAt(i) > 122) 
            {
                chars[count] = i;
                count++;
            }
         }
         
         //starting with highest position char, remove character from string.
         for(int i = count - 1; i >= 0; i --)
         {
            str = str.substring(0,chars[i]) + str.substring(chars[i]+1,str.length());
         }
                  
         System.out.println(str);

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
