package com.bipin.video.day23;

import java.util.Scanner;

public class ExceptionHandlingDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExceptionHandlingDemo1 exceptionHandlingDemo1 = new ExceptionHandlingDemo1();
        int div = exceptionHandlingDemo1.divide(scanner);
        System.out.println("Division is: " + div);
    }

    public int divide(Scanner scanner) {
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        int div = a / b;
        return div;
    }
}
