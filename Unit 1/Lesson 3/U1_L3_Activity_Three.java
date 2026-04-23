/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U1_L3_Activity_Three {
  public static void main(String[] args) {
    //variables
    Scanner scan = new Scanner(System.in);
    boolean answer1;
    boolean answer2;
    // we use booleans here, as the questions are true or false
    // Strings could also be used, but for simplicity, the boolean type is preffered here
    
    //questions and input
    System.out.println("Java is an object-oriented programming language, true or false?"); //true
    answer1 = scan.nextBoolean();
    // nextBoolean() will return a boolean type, and this line assigns that vaule to answer1
    System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?"); //true
    answer2 = scan.nextBoolean();
    
    //scoring
    System.out.println("Question 1 - Your answer: " + answer1 + ". Correct answer: true");
    System.out.println("Question 2 - Your answer: " + answer2 + ". Correct answer: true");
  }
}
