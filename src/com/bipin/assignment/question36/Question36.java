package com.bipin.assignment.question36;

import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the Elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
            System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}