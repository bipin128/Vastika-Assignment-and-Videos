package com.bipin.assignment.question13;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The number is negative " + number);
        } else if (number > 0) {
            System.out.println("Invalid!!!!!!!!!!!!! The number is Positive");
        } else {
            System.out.println(number + "The Number is neither positive nor negative");
        }
    }
}
