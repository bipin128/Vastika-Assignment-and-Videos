package com.bipin.video.day16;

public class MethodDemo4 {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        String[] nameList = {"Ram", "Shyam", "Hari"};
        MethodDemo4.printNameList(nameList);
    }

    private static void printNameList(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
