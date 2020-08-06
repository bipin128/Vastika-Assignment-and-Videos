package com.bipin.video.day11;

import java.util.Scanner;

public class MethodDemo3 {
    public static int sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = scanner.nextInt();
        System.out.println("Enter B: ");
        int b = scanner.nextInt();

        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int result=sum();
        System.out.println(result);
    }
}
