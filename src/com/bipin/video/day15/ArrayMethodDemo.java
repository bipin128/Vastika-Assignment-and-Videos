package com.bipin.video.day15;

import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ar = returnArray(scanner);
        printArray(ar);
    }

    public static String[] returnArray(Scanner scanner) {
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Elements: ");
            arr[i] = scanner.next();
        }
        return arr;
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
