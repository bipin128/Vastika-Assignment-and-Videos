package com.bipin.assignment.question6;

import java.util.Scanner;

public class Question6 {
    int r, l, b, x, y, z;
    double  perimeter, perimeter1, perimeter2;
    final double PI=3.14;
    Scanner scanner = new Scanner(System.in);

    void circle() {
        System.out.println("Enter te radius of the circle(R) :");
        r = scanner.nextInt();
        perimeter = 2 * PI * r;
        System.out.println("The Perimeter of Circle is :" + perimeter);

    }

    void rectangle() {
        System.out.println("**********************************************");
        System.out.println("Enter the Length of rectangle(L) :");
        l = scanner.nextInt();
        System.out.println("Enter the breadth of rectangle(B) :");
        b = scanner.nextInt();
        perimeter1 = 2 * (l * b);
        System.out.println("The Perimeter of rectangle is :" + perimeter1);
    }

    void triangle() {
        System.out.println("**********************************************");
        System.out.println("Enter the length of Triangle(X) :");
        x = scanner.nextInt();
        System.out.println("Enter the breadth of Triangle(Y) :");
        y = scanner.nextInt();
        System.out.println("Enter the height of Triangle(Z) :");
        z = scanner.nextInt();
        perimeter2 = x * y * z;
        System.out.println("The Perimeter of Triangle is :" + perimeter2);
    }

    public static void main(String[] args) {
        Question6 question6 = new Question6();
        question6.circle();
        question6.rectangle();
        question6.triangle();
    }
}
