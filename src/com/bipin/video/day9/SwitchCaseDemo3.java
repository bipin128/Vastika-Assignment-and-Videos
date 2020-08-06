package com.bipin.video.day9;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println("This is Addition");
                break;
            case '-':
                System.out.println("This is Subtraction");
                break;
            case '*':
                System.out.println("This is Multiplication");
            case '/':
                System.out.println("This is Division");
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}