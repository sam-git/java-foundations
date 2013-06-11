//**************************************************************************
//  PP405.java determines and prints the number of odd, even and zero digits
//  in an integer value read from the keyboard.
//  For the purpose of this application zero digits will not be treated as even.
//**************************************************************************

import java.util.Scanner;

public class PP405
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int value, current, odd = 0, even = 0, zero = 0;

    System.out.print("Enter an integer: ");
    value = scan.nextInt();
    
    while (value > 0)
    {
      current = value % 10;
      
      if (current == 0)
        zero++;
      else if (current % 2 == 0)
        even++;
      else
        odd++;
        
      value /= 10;
    }
    
    System.out.print("Odds: " + odd + " Evens: " + even + " Zeros: " + zero );
    
  }
}