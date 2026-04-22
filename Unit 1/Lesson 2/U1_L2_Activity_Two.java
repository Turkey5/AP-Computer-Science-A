/* Lesson 2 Coding Activity Question 2 */

// Scanner class import
import java.util.Scanner;

class U1_L2_Activity_Two {
  public static void main(String[] args) {
    // scanner initialization
    Scanner scan = new Scanner(System.in);
    
    //1st prompt
    System.out.println("Please enter four names:");
    
    // variable initialization and storing
    // note that it is possible to declare a value to the variable on initialization,
    // this can save a lot of space in larger projects and is preferable in certain
    // circumstances
    String nameOne = scan.nextLine(); 
    String nameTwo = scan.nextLine(); 
    String nameThree = scan.nextLine(); 
    String nameFour = scan.nextLine(); 
    
    //final output
    System.out.print(nameFour + " " + nameTwo + " " + nameThree + " " + nameOne);
  }
}
