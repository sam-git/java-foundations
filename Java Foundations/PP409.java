//********************************************************************
//  PalindromeTester.java       Java Foundations
//
//  Demonstrates the use of nested while loops.
//********************************************************************

import java.util.Scanner;

public class PP409
{
   //-----------------------------------------------------------------
   //  Tests strings to see if they are palindromes.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String strg, another = "y", str = "";
      int left, right;

      Scanner scan = new Scanner (System.in);

      while (another.equalsIgnoreCase("y")) // allows y or Y
      {
         System.out.println ("Enter a potential palindrome:");
         strg = scan.nextLine();
         
         strg = strg.toLowerCase();
         int currentLength = strg.length();
         
         Scanner strscan = new Scanner(strg);
         
         String token;
         while(strscan.hasNext())
         {
            token = strscan.next();
            System.out.println(token);
            str = str + token;
         }
         
         System.out.println("Here it is: " + str + "\n");
         
         for (int i=0; i < str.length(); i++)
         {
            System.out.println(str.charAt(i));
            if (str.charAt(i) < 97 || str.charAt(i) > 122)
            {              
                str = str.substring(0,i) + str.substring(i+1,str.length());
            }   
         }

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
