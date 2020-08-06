package com.bipin.assignment.question16;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The Number Entered is Even Number");
        } else {
            System.out.println("The Number Entered is Odd Number");
        }
    }
}
