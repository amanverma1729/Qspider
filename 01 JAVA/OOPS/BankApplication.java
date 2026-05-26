package OOPS;

import java.util.Scanner;

class BankAccount {

    private String username;
    private String phoneNumber;
    private double balance;
    private int pin;

    // Constructor
    public BankAccount(String username, String phoneNumber, int pin) {

        this.username = username;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
        this.balance = 0;
    }

    private boolean verifyPin(int enteredPin) {

        return this.pin == enteredPin;
    }

    public void addMoney(double amount) {

        if (amount > 0) {

            balance += amount;
            System.out.println("Money Added Successfully.");
        }
        else {

            System.out.println("Invalid Amount.");
        }
    }

    public void payMoney(double amount, int enteredPin) {

        if (!verifyPin(enteredPin)) {

            System.out.println("Wrong PIN.");
            return;
        }

        if (amount > balance) {

            System.out.println("Insufficient Balance.");
            return;
        }

        balance -= amount;

        System.out.println("Payment Successful.");
        System.out.println("Remaining Balance: " + balance);
    }

    public void checkBalance(int enteredPin) {

        if (verifyPin(enteredPin)) {

            System.out.println("Current Balance: " + balance);
        }
        else {

            System.out.println("Wrong PIN.");
        }
    }
}

public class BankApplication {

    public static void startApp() {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ CREATE ACCOUNT -------");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Set PIN: ");
        int pin = sc.nextInt();

        BankAccount user = new BankAccount(username, phone, pin);

        int choice;

        do {

            System.out.println("\n------- MENU -------");
            System.out.println("1. Add Money");
            System.out.println("2. Pay Through Wallet");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Amount: ");
                    double addAmount = sc.nextDouble();

                    user.addMoney(addAmount);
                    break;

                case 2:

                    System.out.print("Enter Amount to Pay: ");
                    double payAmount = sc.nextDouble();

                    System.out.print("Enter PIN: ");
                    int payPin = sc.nextInt();

                    user.payMoney(payAmount, payPin);
                    break;

                case 3:

                    System.out.print("Enter PIN: ");
                    int checkPin = sc.nextInt();

                    user.checkBalance(checkPin);
                    break;

                case 4:

                    System.out.println("Thank You.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    } 
}