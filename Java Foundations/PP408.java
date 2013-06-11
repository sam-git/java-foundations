//********************************************************************
//  PP408.java picks a random number between 1 and 100 (inclusive),
//  then repeatedly prompts the user to guess the number
// NEEDS MORE WORK TO RESET VALUES WHEN PLAYED AGAIN.
//********************************************************************

import java.util.Scanner;
import java.util.Random;

public class PP408
{
  static int guess = -1;

  public static void main(String[] args)
  {
    int rand, guessCount = 0;
    Scanner scan = new Scanner(System.in);
    
    Random generator = new Random();
    
    rand = generator.nextInt(100) + 1;
    
    System.out.println("Guess the random number between 1 and 100. 0 to quit.");
    
    while (guess != 0 && rand != guess)
    {
      System.out.print("Guess: ");
      while (!scan.hasNextInt())
      {
        scan.next();
        System.out.println("Guess must be a valid integer.");
        System.out.print("Guess: ");
      }
      guess = scan.nextInt();
      
      if (guess == 0)
      {        
        System.out.println("You quit after " + guessCount + " valid guesses.");
        playAgain();
        continue;
      }      
      else if ((guess < 0 || guess> 100))
      {
        System.out.println("Guess must be between 1 and 100.");
        continue;
      }
      
      guessCount++;
      
     if (guess < rand)
      {
        System.out.println("Guess is low.");
        continue;
      }
      else if (guess > rand)
      {
        System.out.println("Guess is high.");
        continue;
      }
      else
      {
        System.out.println("Correct. You took " + guessCount + " guesses.");
        playAgain();
      }
    }
  }
  
  public static void playAgain()
  {
    Scanner scan = new Scanner(System.in);    
    System.out.print("Play again (y/n)?");    
    String play = scan.next();    
    if (play.toLowerCase().charAt(0) == 'y')
      guess = -1;
      System.out.println("Guess the random number between 1 and 100. 0 to quit.");
  }
  
}