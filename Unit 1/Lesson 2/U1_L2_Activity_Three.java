/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L2_Activity_Three {
  public static void main(String[] args) {
    //scanner initialization
    Scanner scan = new Scanner(System.in);
    
    //variable creation
    String userName;
    String userLocation;
    // contrary to the previous activity, i will showcase here that variables can
    // be created before assigning them a value
    // creating them here assigns them to a value of null, which is a special java
    // keyword that will be important in later units

    // for now, null can just be refrenced as empty, as java will assign it to any
    // uninitialized variable
    
    // questions and variable assignments
    System.out.println("Hi there. What is your name?");
    userName = scan.nextLine();
    System.out.println("What state do you live in?");
    userLocation = scan.nextLine();

    // final output
    System.out.print("My name is " + userName + ". I live in " + userLocation + ".");
    // make sure to correctly place punctuation, as it is easy to misplace a period or
    // space, or simply forget them, causing undesireable results
  }
}
