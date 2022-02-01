/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */

  private Player player1;
  private Player player2;
  private Board game;

  /* your code here - constructor(s) */ 
  public PhraseSolver()
   {
      player1= new Player("Justin");
      player2 = new Player ("Evan");
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
      
      /* your code here - game logic */
      currentPlayer = player1;  // set the current player to Player 1
      Scanner guess = new Scanner(System.in);       // prompt the current player for a guess
      System.out.print("Would you like to guess a, a letter or b, a phrase");

      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
 
}
