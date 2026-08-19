// Task 6: Ask the user for a number and print its multiplication table from 1 to 10 using a for loop.

import java.util.Scanner;

public class code_6 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = ob.nextInt();

        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
        ob.close();
    }
}
