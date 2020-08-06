package com.bipin.video.day19;

import java.util.Scanner;

public class Bank {
    public static void open(Account account) {
        account.openAccount();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Account do you want to open??");
        String choice = scanner.next();
        Account account = null;
        switch (choice) {
            case "Saving":
                account = new Saving();
                break;
            case "Current":
                account = new Current();
                break;
            default:
                System.out.println("Wrong Choice:");
        }
        if (account != null) {
            open(account);
        }
    }
}
