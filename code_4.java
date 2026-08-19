// Task 4: Write a program to check if a person is eligible to vote.
//             • Input: age and citizenship status (true or false).
//             • Use logical operators (&&, ||) to decide eligibility.

import java.util.Scanner;

public class code_4 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        System.out.print("Is Citizen (True/False) : ");
        boolean iscitizen = scan.nextBoolean();

        if (age >= 18 && iscitizen) {
            System.out.println("Eligible to vote");
        } else if (age >= 18 || iscitizen) {
            System.out.println("Partial Criteria met");
        } else {
            System.out.println("Not Eligible to vote");
        }
scan.close();
    }
}