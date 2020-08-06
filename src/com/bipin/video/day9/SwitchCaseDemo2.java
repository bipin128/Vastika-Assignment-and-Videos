package com.bipin.video.day9;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice");
        String choice = scanner.next();

        switch (choice) {
            case "add":
                System.out.println("This is Addition");
                break;
            case "sub":
                System.out.println("This is Subtraction");
                break;
            case "mul":
                System.out.println("This is Multiplication");
            case "div":
                System.out.println("This is Division");
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}