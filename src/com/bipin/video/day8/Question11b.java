package com.bipin.video.day8;

import java.util.Scanner;

public class Question11b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of B: ");
        int b = scanner.nextInt();

        System.out.println("Before Swapping A =" + a);
        System.out.println("Before Swapping B =" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping A =" + a);
        System.out.println("After Swapping B =" + b);
    }
}