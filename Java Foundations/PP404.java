//*********************************************************************
//  PP 4_4
//  Reads a string from the user and prints it one character per line.
//*********************************************************************

import java.util.Scanner;

public class PP404
{
  public static void main(String[] args)
  {
    String str;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    str = scan.nextLine();
    
    for (int i=0; i < str.length(); i++) 
    {
      System.out.println(str.charAt(i));
    }
  }
}
