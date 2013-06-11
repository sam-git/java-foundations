//********************************************************************
//  PP407.java asks the user for a value and prints that many verses
//  of "One Hundred Bottles of Beer."
//********************************************************************

import java.util.Scanner;

public class PP407
{
  public static void main(String[] args)
  {
    int verses = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("How many verses?");
    
    while (verses == 0)
    {    
      while (!scan.hasNextInt())
      {
        scan.next();
        System.out.println("Must be a valid integer.");
        System.out.print("How many verses?");
      }
      verses = scan.nextInt();
      
      if (verses < 1 || verses > 100)
        {
          System.out.println("Must be between 1 and 100 verses.");
          System.out.print("How many verses?");
          verses = 0;
        }
    }
      
    for (int i = 100; i > (100 - verses); i--)
    {
      System.out.println(i + " bottles of beer on the wall");
      System.out.println(i + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      System.out.println( (i - 1) + " bottles of beer on the wall");
    }
  }
}