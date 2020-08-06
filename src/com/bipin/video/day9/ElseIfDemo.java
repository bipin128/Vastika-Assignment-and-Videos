package com.bipin.video.day9;

import java.util.Scanner;

public class ElseIfDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Marks");
        int marks=scanner.nextInt();

        if (marks < 0 || marks > 101) {
            System.out.println("Invalid Marks");
        } else if (marks >= 80 && marks < 100) {
            System.out.println("Distinction");
        } else if (marks >= 60 && marks <= 79) {
            System.out.println("First Division");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Second Division");
        } else if (marks >= 40 && marks <= 49) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }

}
