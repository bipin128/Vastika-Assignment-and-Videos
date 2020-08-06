package com.bipin.video.day23;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.bipin.video.day23.ExceptionHandlingDemo2.divide;

public class ExceptionHandlingDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[2];

        try {
            System.out.println("Enter a:");
            int a = scanner.nextInt();
            System.out.println("Enter b:");
            int b = scanner.nextInt();
            int div = divide(a, b);
            System.out.println("Division is: " + div);
            System.out.println(arr[2]);

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println("----------------------------------------------------");
            System.out.println("Finally Block should be printed Always");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
