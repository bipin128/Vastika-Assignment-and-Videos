package com.bipin.assignment.question14;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vale of A: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of B: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("A is Greater than B");
        } else if (b > a) {
            System.out.println("B is greater than A");
        } else if (a == b) {
            System.out.println("A and B are equal");
        } else {
            System.out.println("Thank You, Have a nice Day");
        }
    }
}
