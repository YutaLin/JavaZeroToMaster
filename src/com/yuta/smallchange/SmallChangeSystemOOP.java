package com.yuta.smallchange;

/*
class for small change features
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSystemOOP {

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

    // 3. change outcome
    String note = "";

    public void mainMenu() {
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
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.outcome();
                    break;
                case "4":
                    // check user want to exit or not
                    this.exit();
                    break;
                default:
                    System.out.println("Invalid choice, please select again");

            }
        } while(loop);

        System.out.println("Goodbye!");
    }

    public void detail() {
        System.out.println(details);
    }

    public void income() {
        System.out.print("Income amount: ");
        money = sc.nextDouble();
        // validate money range( > 0)

        if (money <= 0) {
            System.out.println("Income must be greater than 0");
            return;
        }

        balance += money;
        // concatenate balance message
        date = new Date(); // get current date time
        details += "\nIncome \t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void outcome() {
        System.out.print("Outcome amount: ");
        money = sc.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("Outcome must be greater than 0 and less than balance");
            return;
        }

        System.out.print("Outcome note: ");
        note = sc.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + " \t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit() {
        // check user want to exit or not
        String choice = "";
        while (true) {
            System.out.println("Are you sure you want to exit? (y/n): ");
            choice = sc.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }

        if (choice.equals("y")) {
            loop = false;
        }
    }
}
