package com.yuta.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class smallChangeSystem {

    // complete selection menu and make user select

    public static void main(String[] args) {

        // 1.define select menu
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        String key = "";

        // 2. change detail
        String details = "------change detail-----";

        // 3. change income
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        do {
            System.out.println("=====small change menu=====");
            System.out.println("\t1. change detail");
            System.out.println("\t2. change income");
            System.out.println("\t3. change outcome");
            System.out.println("\t4. exit");

            System.out.print("Please enter your choice(1-4): ");
            key = sc.next();

            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("Income amount: ");
                    money = sc.nextDouble();
                    // validate money range( > 0)

                    balance += money;
                    // concatenate balance message
                    date = new Date(); // get current date time
                    details += "\nIncome: +\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
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
