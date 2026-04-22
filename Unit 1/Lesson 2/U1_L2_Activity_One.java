/* Lesson 2 Coding Activity Question 1 */

// this import statement imports the Scanner class so it is accessible by the program
import java.util.Scanner;

class U1_L2_Activity_One {
  public static void main(String[] args) {
    String userFavFood; 
    // this line dedicates a memory address and initializes userFavFood, but doesnt set its value to anything
    
    Scanner scan = new Scanner(System.in); 
    // this line creates a new Scanner object called scan
    // new declares a new object, without it the code will not compile
    
    System.out.println("What is your favorite food?");
    // we need to ask the user the question first, so they know what to answer with
    
    userFavFood = scan.nextLine();
    // by using scan.nextLine(), we can set the userFavFood variable to whatever the user answers the question with
    // since nextLine() returns a String type, both sides of the = sign will have strings, so the code will work
    
    System.out.println("I like to eat " + userFavFood + " as well!");
    // here you can see the use of the + in strings
    // even though strings arent numbers, we can still use the + symbol to add them together
    // always double check that you have the required spaces, as the + symbol will not add one for you:
    // "hello" + "world" will be equal to "helloworld"
    // instead you need to add a space to one of the strings:
    // "hello " + "world" will equal "hello world", as intended
    // also note that spaces between the string and the + do not matter:
    // "Hello " + "world!" == "Hello "+"world!"
  }
}
