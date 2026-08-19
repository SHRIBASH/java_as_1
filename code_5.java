// Task 5: Write a program that:
//          • Takes two numbers and an operator symbol (+, -, *, /) from the user.
//          • Uses if-else statements to perform the appropriate operation.

import java.util.Scanner;

public class code_5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double a = sc.nextDouble();
        System.out.print("Enter Second Number : ");
        double b = sc.nextDouble();
        System.out.print("Enter Operator (+, -, *, /) : ");
        char ao = sc.next().charAt(0);

        if (ao == '+') {
            System.out.println("Result : " + (a + b));
        } else if (ao == '-') {
            System.out.println("Result : " + (a - b));
        } else if (ao == '*') {
            System.out.println("Result : " + (a * b));
        } else if (ao == '/') {
            if ( b != 0)
                System.out.println("Result : " + (a / b));
            else 
                System.out.println("Not defined");
        } else {
            System.out.println("Invalid Operator");
            }
        sc.close();    
    }   
}
