package com.bipin.assignment.question24;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        long factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
