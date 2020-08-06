package com.bipin.assignment.question10b;

import java.util.Scanner;

public class Question10b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of A :");
        int a = scanner.nextInt();
        System.out.println("Enter the value of B :");
        int b = scanner.nextInt();
        System.out.println("Enter the value of C :");
        int c = scanner.nextInt();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of given equation is :" + area);
    }
}
