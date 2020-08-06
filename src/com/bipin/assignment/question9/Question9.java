package com.bipin.assignment.question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        double p, KG;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value in Pound(P) :");
        p = scanner.nextInt();
        KG = p * 0.454;
        System.out.println("The value in KG is :" + KG);
    }
}
