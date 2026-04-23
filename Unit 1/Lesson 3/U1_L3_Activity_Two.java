/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L3_Activity_Two {
  public static void main(String[] args) {
    //variables
    Scanner scan = new Scanner(System.in);
    String userName;
    int userAge;
    // using an int for the age is appropriate, as no decimal precision is required

    // if we want further optimization, using the byte type might work better
    // bytes store a value from -128 to 127
    // that would look something like this:
    // byte userAge;
    // userAge = scan.nextByte();
    
    //initial prompts and input
    System.out.println("Hi there. What is your name?");
    userName = scan.nextLine();
    
    //second prompt and input
    System.out.println("Hi " + userName + ". How old are you?");
    userAge = scan.nextInt();
    
    //final output
    System.out.print(userName + " is " + userAge + " years old.");
  }
}
