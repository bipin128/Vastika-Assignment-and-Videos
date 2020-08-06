package com.bipin.assignment.question28;

import java.util.Scanner;

public class Question28 {
    void isPrimeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter te Number: ");
        int n = scanner.nextInt();
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }

    void firstNthPrime() {
        int status = 1;
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************************************************");
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        if (n >= 1) {
            System.out.println("First " + n + " prime numbers are:");
            System.out.println(2);
        }

        for (int i = 2; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
    void allPrimeBetween(){
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";
        System.out.println("*********************************************");
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + n  + " are  :");
        System.out.println(primeNumbers);
    }

    public static void main(String[] args) {
        Question28 question28 = new Question28();
        question28.isPrimeNumber();
        question28.firstNthPrime();
        question28.allPrimeBetween();
    }
}

