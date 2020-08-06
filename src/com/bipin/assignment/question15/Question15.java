package com.bipin.assignment.question15;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 128) {

            System.out.println("The character for ASCII code " + number + " is " + (char) number);
        }
    }
}