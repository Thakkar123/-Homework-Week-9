package homework;
/** Re write the student mark sheet programme using if else and while loop.*/

import java.util.Scanner;

/**Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks
  (marks is between 0 to 100 and if it is out of range print error messageInvalid  Input, Marks should between 0 to 100
 * and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35)
 * and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
*/

public class Program2 {

    String name, result;
    String grade = null;
    int maths, science, english, rollno;
    float total, percentage;

    public static void main(String[] args) {
        Program2 p = new Program2();        // object creation
        p.studentDetails();                  // calling method1 studentdetails via object reference
        p.calculation();                    // calling method2 calculation via object reference
        p.logic();                          // calling method3 logic via object reference
        p.marksheet();

    }

    public void studentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name");
        name = scanner.nextLine();
        System.out.print("Enter Student roll no: ");
        rollno = scanner.nextInt();

        System.out.print("Enter marks for Maths: ");
        maths = scanner.nextInt();
        while (maths > 100 || maths < 0) {
            System.out.println("Invalid Input, Maths marks should be between 0 to 100");
            maths = scanner.nextInt();
        }

        System.out.print("Enter marks for Science: ");
        science = scanner.nextInt();
        while (science > 100 || science < 0) {
            System.out.println("Invalid Input, Science marks should be between 0 to 100");
            science = scanner.nextInt();
        }

        System.out.print("Enter marks for English: ");
        english = scanner.nextInt();
        while (english > 100 || english < 0) {
            System.out.println("Invalid Input, Maths marks should be between 0 to 100");
            english = scanner.nextInt();
        }
    }

    public void calculation() {
       total = maths + science + english;     // total of all three subjects
       percentage = ((total * 100) / 300);   // percentage calculation
    }
    public void logic()     //
    {
        if (percentage >= 35) {
            result = "pass";
        } else {
            result = "fail";
        }
        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
            System.out.println("Grade: " + grade);
        } else {
            grade = "No grade";
        }
    }

    public void marksheet()    // Instance method 4 marksheet
    {
        System.out.println("-------------------------------------");
        System.out.println("|-----------------------------------|");
        System.out.println("|            Mark Sheet             |  ");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Name         :      " + name + "         |");
        System.out.println("|  Roll No:              " + rollno + "          |");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Subjects   :     Marks           |");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Maths:           " + maths + "              |");
        System.out.println("|  Science:         " + science + "              |");
        System.out.println("|  English:        " + english + "               |");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Total:      :    " + total + "             |");
        System.out.println("|-----------------------------------|");
        System.out.println("|  Percentage:    " + percentage + "              |");
        System.out.println("|  Result:         " + result + "             |");
        System.out.println("|  Grade:          " + grade + "               |");
        System.out.println("|-----------------------------------|");
    }




}