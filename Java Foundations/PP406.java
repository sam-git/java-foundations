//**************************************************************************
//  PP406 Produces a multiplication table, showing the results of multiplying
//  the integers 1 through 12 by themselves.
//**************************************************************************
import java.text.NumberFormat;

public class PP406
{
  public static void main(String[] args)
  {
    NumberFormat fmt = NumberFormat.getInstance();    
    fmt.setMinimumIntegerDigits(3);          
    
    for (int i = 1; i <= 12; i++)
    {
      System.out.println(fmt.format(i) + " x " + fmt.format(i) 
                          + " = " + fmt.format(i * i));
    }
  }
}