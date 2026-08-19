// Task 9: Write a program to read 10 integers into an array and find the maximum value using a loop.

import java.util.Scanner;

    public class code_9 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
       
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Maximum value = " + max);
        sc.close();
    }
}