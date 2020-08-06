package com.bipin.assignment.question20;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number X: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second Number Y: ");
        int y = scanner.nextInt();
        System.out.println("Enter the operator ");
        int operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                operator = x + y;
                System.out.println("The addition of two number is :" + operator);
                break;
            case '-':
                operator = x - y;
                System.out.println("The subtraction of two number is :" + operator);
                break;
            case '*':
                operator = x * y;
                System.out.println("The multiplication of two number is :" + operator);
                break;
            case '/':
                operator = x / y;
                System.out.println("The division of two number is :" + operator);
                break;
            default:
                System.out.println("Invalid operation!!!!!!!!!");
        }
    }
}
