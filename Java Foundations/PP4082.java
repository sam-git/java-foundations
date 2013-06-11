//********************************************************************
//  PP4082.java picks a random number between 1 and max (inclusive),
//  then repeatedly prompts the user to guess the number
//********************************************************************

import java.util.Scanner;
import java.util.Random;

public class PP4082
{

  final static int max = 100;

  //********************************************************************
  //  Plays the guessing game.
  //********************************************************************
  static public void main (String[] args)
  {
    int gameCount = 0;
    int[] scores = new int[10000];
    
    do
    {
      scores[gameCount] = playGame();
      gameCount++;      
    }
    while(playAgain());
    
    displayResults(gameCount, scores);
  }

  //********************************************************************
  //  Displays results of all games at completion.
  //********************************************************************
  static void displayResults(int gameCount, int[] scores)
  {
    int sum = 0, invalidGames = 0;
   
    for(int i = 0; i < gameCount; i++)
    {
      if (scores[i] == 0)
        invalidGames ++;
      else
        sum += scores[i];
    }
    
    double average = (double)sum / (gameCount - invalidGames);
    System.out.println("Your completed " + (gameCount - invalidGames) + " games for an avergae of " + average + " guesses per game.");
    if(invalidGames > 0)
      System.out.println("You had " + invalidGames + " of " + gameCount + " incomplete games which did not affect your average.");
  }

  //*********************************************************************************
  //  Plays one instance of the guessing game until user quits or number is guessed.
  //  Returns number of guesses, or 0 if user quits.
  //*********************************************************************************
  static int playGame()
  {
    int guess, closestGuess = max, guessCount = 0, rand = generateRandomNumber(max), previousGuess = 0;
    boolean guessAttempt = false, warmer = false, same = false;
    
    System.out.println("Guess the random number between 1 and " + max + ". 0 to quit. v2");
    
    do
    {
      System.out.print("Guess: ");
      guess = getIntGuess();
      if (guess == 0) 
      {
        System.out.println("You quit after " + guessCount + " valid guesses.");
        System.out.println("The answer was: " + rand);
        System.out.println(guessAttempt ? "Your closest guess was: " + closestGuess + "\n": "");
      }
      else 
      {
        guessCount++;        
        
        if (guessAttempt) {
          if (Math.abs(rand - guess) == Math.abs(rand - previousGuess))
            same = true;
            
          if (Math.abs(rand - guess) < Math.abs(rand - previousGuess))
            warmer = true;
          else
            warmer = false;
        }
          
        if (Math.abs(rand - guess) < Math.abs(rand - closestGuess))
          closestGuess = guess;
                
        if (guess == rand)
          System.out.println("Correct. You took " + guessCount + " guesses.\n");
        else
          System.out.print(guessAttempt ? guess + " is " + ( same ? "neither warmer or colder " : ( warmer ? "warmer " : "colder ") ) + "than " + previousGuess + ". " : "" );
          if (guess < rand)
            System.out.println("Guess is low.");
          else if (guess > rand)
            System.out.println("Guess is high.");
        
        previousGuess = guess;
                
        if(!guessAttempt) 
        {
          guessAttempt = true;
          closestGuess = guess;
        } 
      }
    }
    while (guess != 0 && rand != guess);
    
    return (guess==0) ? 0 : guessCount;
  }
  
  //********************************************************************
  //  Returns a valid guess from user.
  //********************************************************************
  static int getIntGuess()
  {
    int guess;
    Scanner scan = new Scanner(System.in);
    
    do
    {
      while (!scan.hasNextInt())
      {
        scan.next();
        System.out.println("Guess must be a valid integer.");
        System.out.print("Guess: ");
      }      
      guess = scan.nextInt();      
      if (isGuessOutOfRange(guess))
      {
        System.out.println("Guess must be between 1 and " + max + ".");
        System.out.print("Guess: ");
      }
    }
    while (isGuessOutOfRange(guess));
    
    return guess;
  }
  
  //********************************************************************
  //  Checks if users guess is within valid range.
  //********************************************************************
  static boolean isGuessOutOfRange(int guess)
  {
    return (guess < 0 || guess> max);
  }

  //********************************************************************
  //  Asks the user if they want to play again.
  //********************************************************************
  static boolean playAgain()
  {
    Scanner scan = new Scanner(System.in);    
    System.out.print("Play again (y/n)?");    
    String play = scan.next();    
    return (play.toLowerCase().charAt(0) == 'y');
  }
  
  //********************************************************************
  //  Generates and returns a random number for user to guess.
  //********************************************************************  
  static int generateRandomNumber(int max)
  {
    Random generator = new Random();    
    int rand = generator.nextInt(max) + 1;
    return rand;
  }
}