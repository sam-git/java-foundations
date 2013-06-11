//********************************************************************************
//  SumEven.java reads an integer value and prints the sum of all the even digits
//  between 2 and the input value, inclusive.
//********************************************************************************

import java.util.Scanner;

public class SumEven
{
  public static void main (String[] args)
  {
    int value, sum = 0;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter value: ");
    value = scan.nextInt();
    
    while (value < 2)
    {
      System.out.println("Value cannot be less than 2.");
      System.out.print("Enter value: ");
      value = scan.nextInt();
    }
        
    for (int i = 2; i <= value; i+=2) 
    {
      sum += i;
    }
    
    System.out.println("The sum of all even integers between 2 and " + value
                        + " is: " + sum + ".");     
  } 
}