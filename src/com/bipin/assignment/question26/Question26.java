package com.bipin.assignment.question26;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();
        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }

        System.out.println("Reverse of the number is " + reverse);

    }
}
