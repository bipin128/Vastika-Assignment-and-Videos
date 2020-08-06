package com.bipin.assignment.question19;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A: ");
        int a = scanner.nextInt();
        System.out.println("Enter side B: ");
        int b = scanner.nextInt();
        System.out.println("Enter side C: ");
        int c = scanner.nextInt();

        if (a == b && b == c)
            System.out.println("Equilateral");

        else if (a >= (b + c) || c >= (b + a) || b >= (a + c))
            System.out.println("Not a triangle");

        else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a))
            System.out.println("Isosceles");

        else if (a != b && b != c && c != a)
            System.out.println("Scalene");
    }
}
