import java.util.Scanner;
/**
 * Deteremines if a number is prime or not
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to enter an integer
    System.out.println("Which number would you like to check?");
    int integer = input.nextInt();

    // declare and initialize a counting variable
    int count = 1;

    while(count <= integer){
      count = count + 1;
      if(integer%count == 0 && count < integer){
        System.out.println(integer + " is not a prime number");
        break;
      } else if(count == integer && integer%integer == 0){
        System.out.println( integer + " is a prime number");
      }
    } 
      
    
  }
}

