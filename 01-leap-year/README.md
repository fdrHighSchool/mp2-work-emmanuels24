# Leap Year
#### Respond to the following:

1. Rewrite the following nested `if()` statements in a single line:
  ```
  if (year % 4 == 0) {
      if (year % 100 != 0) {
        // DO STUFF
      } // end inner if statement
   } // end outer if statement
  ```
  * **YOUR WRITING HERE**


2. Label each as either correct or incorrect syntax. If incorrect, rewrite below:
  * if (x == y) {

    * Correct

  * if [x == 10] {

    *Incorrect
    if (x == 10) {

  * if x = 10 then {

    *Incorrect 
    if (x == 10)

  * if (x equals 42) {

    *Incorrect
    if (x == 42) {

  * if (x => y) {

    *Correct


3. Fix the error in the code below:

  ```
  Scanner console = new Scanner(System.in);
  System.out.print("What is your favorite color? ");
  String name = console.next();
  if (name == "blue") {
      System.out.println("Mine, too!");
  }
  ```
    
  * import java.util.Scanner;
    Scanner console = new Scanner(System.in);
    System.out.print("What is your favorite color?");
    String name = console.next();
    if (name == "blue") {
      System.out.println("Mine, too!")
    }
