package com.bipin.assignment.question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int p, t, r;
        float simpleInterest;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal Amount(P) : ");
        p = scanner.nextInt();

        System.out.println("Enter Time(T) : ");
        t = scanner.nextInt();

        System.out.println("Enter Interest Rate(R) : ");
        r = scanner.nextInt();

        simpleInterest = (p * t * r) / 100;
        System.out.println("Simple Interest of the given data is " + simpleInterest);
    }
}
