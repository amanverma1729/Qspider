package OOPS.foodApp;

import java.util.Scanner;

class FoodOrderApp {

    Scanner sc = new Scanner(System.in);

    void startApp() {

        int choice;

        do {

            System.out.println("\n===== FOOD MENU =====");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Drinks");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    Pizza p = new Pizza("Cheese Pizza", 250, 2);

                    System.out.println("\n--- Pizza Order ---");
                    p.display();

                    break;

                case 2:

                    Burger b = new Burger("Veg Burger", 120, 3);

                    System.out.println("\n--- Burger Order ---");
                    b.display();

                    break;

                case 3:

                    Drinks d = new Drinks("Cold Drink", 80, 1);

                    System.out.println("\n--- Drinks Order ---");
                    d.display();

                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while(choice != 4);
    }

    public static void main(String[] args) {
        FoodOrderApp app = new FoodOrderApp();
        app.startApp();
    }
}
