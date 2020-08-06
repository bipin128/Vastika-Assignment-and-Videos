package com.bipin.assignment.question18;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x = scanner.nextInt();
        System.out.println("Enter the value of Y: ");
        int y = scanner.nextInt();
        System.out.println("Enter the value of Z");
        int z = scanner.nextInt();
        if (x > y && x > z)
            System.out.println("First number is the largest.");
        else if (y > x && y > z)
            System.out.println("Second number is the largest.");
        else if (z > x && z > y)
            System.out.println("Third number is the largest.");
        else
            System.out.println("The numbers are not distinct.");
    }
}
