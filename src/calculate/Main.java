package calculate;

import java.util.Scanner;

/**
 * 4. Write a “main” method into main class. It has scanner that takes user
 * input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective
 * for other symbol.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate) */

public class Main {

 public static void main(String[] args) {

  char s1;
  do {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter first Number");
   int a = scanner.nextInt();
   System.out.println("Enter second Number");
   int b = scanner.nextInt();
   System.out.println("Please enter one of symbol +,-,*,/: ");
   char symbol = scanner.next().charAt(0);
   Calculator calc = new Calculator();
   calc.calculateResult(a, b, symbol);
   System.out.print("Would you like to do more calculation please enter \"Y\" or \"N\": ");
   s1 = scanner.next().charAt(0);
   } while (s1 == 'Y' || s1 == 'y');
 }
 }
