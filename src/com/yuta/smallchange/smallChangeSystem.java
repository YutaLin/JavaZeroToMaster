package com.yuta.smallchange;

import java.util.Scanner;

public class smallChangeSystem {

    // complete selection menu and make user select

    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        String key = "";
        do {
            System.out.println("=====small change menu=====");
            System.out.println("\t1. change detail");
            System.out.println("\t2. change income");
            System.out.println("\t3. outcome");
            System.out.println("\t4. exit");

            System.out.print("Please enter your choice(1-4): ");
            key = sc.next();

            switch (key) {
                case "1":
                    System.out.println("1. change detail");
                    break;
                case "2":
                    System.out.println("2. change income");
                case "3":
                    System.out.println("3. outcome");
                    break;
                case "4":
                    System.out.println("4. exit");
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid choice, please select again");

            }
        } while(loop);

        System.out.println("Goodbye!");
    }
}
