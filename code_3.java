// Task 3: Accept two integers from the user and perform addition,
//         subtraction, multiplication, division, and modulus.
//         Display results for each operation.

import java.util.Scanner;

public class code_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Integer  : ");
        int a = input.nextInt();

        System.out.print("Enter Second Integer : ");
        int b = input.nextInt();

        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));

        input.close();
    }
}