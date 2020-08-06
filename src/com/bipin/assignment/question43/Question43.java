package com.bipin.assignment.question43;

import java.util.Scanner;

import static com.bipin.video.day23.ExceptionHandlingDemo2.divide;

public class Question43 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5, 6};
            for (int i = 0; i <= arr.length; i++)
                System.out.println(arr[i]);
        } catch (Exception ee) {
            System.out.println(ee);
        }

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------------------------------------");
            System.out.println("Enter a:");
            int a = scanner.nextInt();
            System.out.println("Enter b:");
            int b = scanner.nextInt();
            int div = divide(a, b);
            System.out.println("Division is: " + div);
            System.out.println("-------------------------------------------");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getStackTrace());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
