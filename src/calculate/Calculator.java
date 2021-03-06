package calculate;

/**
 * package calculate;
 * /**1. Write a java program using the following descriptions
 *  1. Create one package with name calculate
 *  2. Create two class with name “Calculator” and “Main”
 *  3. Create four methods with manes “addition”, “subtraction”, “division”,
 *  and “multiplication”. All methods are instance method and it doesn’t
 *  return anything. But it has two parameters with name “int a” and “int
 *  b”. Also each method have System.out.println(). This prints the result.
 *  Also create all one more method with name “calculateResult” with
 *  three parameter with name int a, int b and char symbol. Write the logic
 *  in calculateResult method that when user enter first number and
 *  second number and symbol based on symbol it does calculate.*/

public class Calculator {
    public void addition(int a, int b)
    {
        System.out.println("Addition of " + a + " and " + b + " is: "+(a+b));
    }
    public void subtraction(int a, int b)
    {
        System.out.println("Subtraction of " + a + " and " + b + " is :"+(a-b));
    }
    public void division(int a, int b)
    {
        System.out.println("Division of " + a + " and " + b + " is : "+(a /b));
    }
    public void multiplication(int a, int b)
    {
        System.out.println("Multiplication of " + a + " and " + b + " is "+(a*b));
    }
    public void calculateResult(int a, int b, char c)
    {
        if(c=='+'){
            addition(a,b);
        }else if(c=='-'){
            subtraction(a,b);
        }else if(c=='/'){
            division(a,b);
        }else if(c=='*'){
            multiplication(a,b);
        }else{
            System.out.println("Please input the correct symbol");
        }
    }
}
