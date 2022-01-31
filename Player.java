/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
    private String name;

    private int points;

  /* your code here - constructor(s) */ 
  public Player()
  {
    System.out.print("Enter Player Name: ");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    System.out.println("Welcome, " + name);
    points = 0;
  }
  public Player(String inputName)
  {
    name = inputName;
    points = 0;
    System.out.println("Welcome, " + name);
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}
