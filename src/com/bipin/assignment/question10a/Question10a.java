package com.bipin.assignment.question10a;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question10a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of U : ");
        int u = scanner.nextInt();
        System.out.println("Enter the value of T :");
        int t = scanner.nextInt();
        System.out.println("Enter the value of A: ");
        int a = scanner.nextInt();

        double s = u*t+0.5*a*t*t;
        System.out.println("The value of S = " + s);
    }
}
