package com.bipin.video.day23;

public class ExceptionHandlingDemo5 {
    public static void main(String[] args) {
        vote(10);
        System.out.println("End");
    }

    public static void vote(int age) {
        if (age > 18) {
            System.out.println("You are eligible to vote. ");
        } else {
            throw new InvalidAgeException("You are not eligible to vote. ");
        }

    }
}
