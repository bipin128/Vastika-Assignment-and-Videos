package com.bipin.assignment.question23;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("Sum is :" + sum);
    }
}
