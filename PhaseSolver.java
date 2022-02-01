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
      
      
      currentPlayer ==1;  // set the current player to Player 1
          // prompt the current player for a guess
      System.out.print("Would you like to guess a letter (a) or the phrase (b)");
      String choice = input.nextLine();
      if (choice.equals("a"))
      {
        System.out.println("What letter would you like to choose?");
      }
      else
      {
        System.out.println("What do you think the phrase is?")
      }
    
    
    
    
    

      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
 
}
