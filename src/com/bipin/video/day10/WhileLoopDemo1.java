package com.bipin.video.day10;

import java.util.Scanner;

public class WhileLoopDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Enter Name ");
            String name = scanner.next();
            System.out.println("Name is: " + name);
            if (name.equalsIgnoreCase("Bipin")) {
                flag = false;
            }
        }
            System.out.println("!!!!!!!!!!!Exit!!!!!!!!1111");
        }
}
