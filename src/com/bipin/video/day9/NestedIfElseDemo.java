package com.bipin.video.day9;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        int c = 150;

        if (a > b) {
            if (a > c) {
                System.out.println("A is the Largest one.");
            } else {
                System.out.println("C is the largest one.");
            }
        }else{
                System.out.println("B is greater than A but C may be smaller or greater than A");
            }
        }
    }
