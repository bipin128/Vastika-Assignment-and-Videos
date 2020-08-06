package com.bipin.assignment.question10c;

import java.util.Scanner;

public class Question10c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of B: ");
        int b = scanner.nextInt();
        System.out.println("Enter the value of C: ");
        int c = scanner.nextInt();

        double x = (-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a;
        System.out.println("The value of C is :" + x);
    }
}
