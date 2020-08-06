package com.bipin.assignment.question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int a, b, sum;
        float average;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number(a) : ");
        a = scanner.nextInt();

        System.out.println("Enter Second Number(b) : ");
        b = scanner.nextInt();

        sum = a + b;
        average = (a + b) / 2;

        System.out.println("Sum of two numbers is : " + sum);
        System.out.println("Average of two numbers is : " + average);

    }
}
