package com.bipin.video.day16;

import java.util.Scanner;

public class MethodDemo2 {
    public static void printArrayElement(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static int[] returnArray(Scanner scanner) {
        System.out.println("Enter the size of the array ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = returnArray(new Scanner(System.in));
        printArrayElement(arr);
    }
}
