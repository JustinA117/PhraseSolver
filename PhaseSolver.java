/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
  
public class PhraseSolver
{
  /* your code here - attributes */

  private Player player1;
  private Player player2;
  private Board game;

  /* your code here - constructor(s) */ 
  public PhraseSolver()
   {
      player1= new Player();
      player2 = new Player();
      game = new Board();
   
   }


  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {   
      game.setLetterValue();
      // prompt the current player for a guess
      System.out.println(game.getPhrase()); // delete this when game is complete
      System.out.println(game.getSolvedPhrase());
      
      //check to see current player and prompt for their name
      if (currentPlayer == 1)
      {
        System.out.print(player1.getName());
      }
      else
      {
        System.out.print(player2.getName());
      }

      System.out.println(", Would you like to guess a letter (a) or the phrase (b)");

      String choice = input.nextLine();
      
      if (choice.equals("a")) // checking individual letters
      {
        System.out.println("What letter would you like to choose?");
        String letter = input.nextLine();
        for (int i = 0; i < game.getPhrase().length(); i++){
            if (letter.equals(game.getPhrase().substring(i, i + 1)))
        {
          System.out.println("That letter is correct");
          
          int letterValue= game.getLetterValue();

          if (currentPlayer == 1) // Add the points to current player 
      {
        player1.addToPoints(letterValue);
      }
      else
      {
        
        player2.addToPoints(letterValue);
      }
          game.guessLetter(letter);
        }
        }
        
      if (currentPlayer == 1)
      {
        currentPlayer += 1;
      }
      else
      {
        currentPlayer = 1;
      }
      }
      else // this is chekcing if the whole phrase is solved
      {
        System.out.println("What do you think the phrase is?");
        String phraseGuess = input.nextLine();
        if (phraseGuess.equals(game.getPhrase()))
        {
          System.out.println("Good job you have correctly guessed the phrase!");
          solved = true;
        }
        else
        {
          System.out.println("Unfortunately you are stupid so you incorrectly guessed the phrase, better luck next time");
          
        }
        
      }
// player 1 score
   

    } //end of while statement
   if (player1.getPoints() > player2.getPoints())
{
  System.out.println("congrats " + player1.getName() + " you have won the game");
}
else if (player1.getPoints() < player2.getPoints()){
  System.out.println("congrats " + player2.getName() + " you have won the game");
}
else
{
  System.out.println("You guys tied");
}
  }
 
}
