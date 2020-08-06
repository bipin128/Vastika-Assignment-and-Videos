package com.bipin.assignment.question33;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        int temp;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int a[] = new int[size];

        System.out.println("Enter all " + size + " elements of the array: ");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("The given array in Ascending Order:");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}