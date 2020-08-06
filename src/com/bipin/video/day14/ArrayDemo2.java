package com.bipin.video.day14;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter elements: ");
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
