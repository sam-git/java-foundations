//**************************************************************
//  LeapYear2.java
//
//  Asks user for a year and checks to see if it is a leap year.
//**************************************************************

import java.util.Scanner;

public class LeapYear2
{
  public static void main(String args[])
  {
    int year;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a year XXXX (0 to quit): ");
    year = scan.nextInt();
    
    while (year != 0) {
      if (year < 1582)
        System.out.println("The Gregorian calender was apoted in 1582. Year must not be less than 1582.");
      else if ( (year % 400 == 0) || ( (year % 4 == 0) && (year % 100 != 0) ) )				
        System.out.println("" + year + " is a leap year");
      else
        System.out.println(year + " is NOT a leap year");
       
      System.out.print("Enter a year XXXX (0 to quit): ");
      year = scan.nextInt();
    }
  }
}