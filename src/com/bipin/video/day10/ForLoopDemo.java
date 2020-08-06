package com.bipin.video.day10;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("Sum is :" + sum);
    }
}
