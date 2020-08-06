package com.bipin.assignment.question34;

import java.util.Scanner;

public class Question34 {
    public static void main(String... args) {
        int i, j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] reverse = new int[size];
        System.out.println("Enter All " + size + " elements ");
        for (i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Reverse of an array is :");
        for (i = size; i > 0; i--, j++) {
            reverse[j] = array[i - 1];
            System.out.println(reverse[j]);

        }

    }
}
