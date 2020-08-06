package com.bipin.video.day2;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int a = scanner.nextInt();

        System.out.println("Enter Second Number :");
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        int div = a / b;
        int mul = a * b;
        System.out.println("The sum of two numbers " + a + " and  " + b + " is " + sum);
        System.out.println("The Subtraction of two numbers " + a + " and  " + b + " is " + sub);
        System.out.println("The multiplication of two numbers  " + a + " and  " + b + " is " + mul);
        System.out.println("The Division of two numbers  " + a + " and  " + b + " is " + div);

    }
}
