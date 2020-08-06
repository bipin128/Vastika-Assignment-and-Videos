package com.bipin.assignment.question12;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Persons ID :");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Name of the Person :");
        String name = scanner.nextLine();

        System.out.println("Enter the Nationality of the Person: ");
        String nationality = scanner.nextLine();

        System.out.println("*********************************************************");
        System.out.println("The id of the person is : " + id);
        System.out.println("----------------------------------------------------------");
        System.out.println("The Name of the person is : " + name);
        System.out.println("------------------------------------------------------------");
        System.out.println("The Nationality of the person is : " + nationality);
        System.out.println("*********************************************************");
    }
}
