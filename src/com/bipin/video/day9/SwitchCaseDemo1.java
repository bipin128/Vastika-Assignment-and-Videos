package com.bipin.video.day9;

import java.util.Scanner;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("This is Addition");
                break;
            case 2:
                System.out.println("This is Subtraction");
                break;
            case 3:
                System.out.println("This is Multiplication");
            case 4:
                System.out.println("This is Division");
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
