package com.bipin.video.day15;

import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {
        final int ROW = 3;
        final int COLUMN = 3;
        int[][] arr = new int[ROW][COLUMN];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Enter the number: ");
                arr[i][j] =scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
