// Task 8: Write a program that:
//            • Reads marks of 5 students into an integer array.
//            • Prints each student’s marks.

import java.util.Scanner;

public class code_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter marks of 5 students" );
        for (int i = 0; i < 5; i++){
            System.out.print("Student " + (i + 1) + "   :   ");
            marks[i] = sc.nextInt();
        }
        
        System.out.println("\nMarks of Students");
        for (int i = 0; i < 5; i++){
            System.out.println("Student " + (i + 1) + "   =   " + marks[i]);
        }
        sc.close();    
    }
}