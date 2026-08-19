// Task 7: Write a program that uses a while loop to find the sum of all even numbers between 1 and 50.

public class code_7 {
    public static void main (String[] arg) {
        int sum = 0;
        int i = 1;
        while (i <= 50) {
            if ( i % 2 == 0 ) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum of all even numbers from 1 to 50 is " + sum );
    }
}
