package com.bipin.assignment.question38;

import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {
        String a, b = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String you want to check- ");
        a = scanner.nextLine();
        int n = a.length();

        for (int i = n - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
    }
}

