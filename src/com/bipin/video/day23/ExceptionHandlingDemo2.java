package com.bipin.video.day23;

import java.util.Scanner;

public class ExceptionHandlingDemo2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a:");
            int a = scanner.nextInt();
            System.out.println("Enter b:");
            int b = scanner.nextInt();
            int div = divide(a, b);
            System.out.println("Division is: " + div);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getStackTrace());
        } finally {
            System.out.println("----------------------------------------------------");
            System.out.println("Finally Block should be printed Always");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}