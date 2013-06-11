//**************************************************************************
//  PP406 Produces a multiplication table, showing the results of multiplying
//  the integers 1 through 12 by themselves.
//**************************************************************************
import java.text.NumberFormat;

public class PP4062
{
  public static void main(String[] args)
  {
    System.out.print("\t|");
    for (int i = 1; i <=12; i++)
    {
      System.out.print(i + "\t");
    }
    
    System.out.println();

    for (int i = 1; i <= 100; i++) 
      {
        if (i == 9)
          System.out.print("+");
        else
          System.out.print("-");
      }

    System.out.println("\t|");     
      
    for (int i = 1; i <= 12; i++)
    {
      System.out.println();
      System.out.print(i + "\t|");
      
      for (int j = 1; j <= 12; j++)
      {
        System.out.print(i*j + "\t");
      }
    }
  }
}