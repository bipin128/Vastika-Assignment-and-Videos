package com.bipin.assignment.question7;

import java.util.Scanner;

public class Question7 {
    int r, h;
    double volume;
    final double PI=3.14;

    Scanner scanner = new Scanner(System.in);

    void cylinder() {
        System.out.println("Enter the radius of Cylinder(R) :");
        r = scanner.nextInt();

        System.out.println("Enter the height of Cylinder(H) :");
        h = scanner.nextInt();

        volume = PI * (Math.pow(r,2)) * h;
        System.out.println("The volume of Cylinder is :" + volume);
    }

    public static void main(String[] args) {
        Question7 question7 = new Question7();
        question7.cylinder();
    }
}
