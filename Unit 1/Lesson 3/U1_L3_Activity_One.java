/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L3_Activity_One {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    // this creates 3 different double variables
    double input1;
    double input2;
    double input3;
    // none of these will hold any value until assigned
    
    //prompts
    System.out.println("Please enter 3 doubles:");
    
    // the nextDouble() method will read the user input and will return a double value
    // we set the inputs to the value that is returned using the = 
    // use of nextInt() will result in a lack of decimal precision
    input1 = scan.nextDouble();
    input2 = scan.nextDouble();
    input3 = scan.nextDouble();
    
    //output
    System.out.print(input3 + " " + input2 + " " + input1);
  }
}
