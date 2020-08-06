package com.bipin.assignment.question11a;

import java.util.Scanner;

public class Question11a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of B: ");
        int b = scanner.nextInt();

        System.out.println("Before Swapping A =" + a);
        System.out.println("Before Swapping B =" + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping A =" + a);
        System.out.println("After Swapping B =" + b);
    }
}
