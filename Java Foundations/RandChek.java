import java.util.Random;

public class RandChek
{
  public static void main(String[] args)
  {
    Random generator = new Random();
    int hundred = 0, zero = 0, one = 0;
    
    for (int i=0; i < 100000; i++) 
    {
      int rand = generator.nextInt(100) + 1;
      if (rand == 100)
        hundred++;
      else if (rand == 0)
        zero++;
      else if (rand == 1)
        one++;
    }
    System.out.println("100's: " + hundred);
    System.out.println("1's: " + one);
    System.out.println("0's: " + zero);
  }
}