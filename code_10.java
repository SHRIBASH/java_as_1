// Task 10: Write a program that:
//            • Reads marks of 5 subjects into an array.
//            • Calculates the average marks.
//            • Uses if-else to assign grades:
//                  o >= 90: A
//                  o >= 75: B
//                  o >= 50: C
//                  o Else: Fail

import java.util.Scanner;

public class code_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / 5.0;
        System.out.println("Average marks = " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
        sc.close();
    }
}