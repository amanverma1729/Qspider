package OOPS.miniApp2;

import java.util.Scanner;

public class FoodOrderAppController {

	public static void main(String[] args) {

		System.out.println("------WELCOME------------");

		FoodItem item;
		

		while (true) {
			
			System.out.println("SELECT any below option : ");
			System.out.println("Press 1\t Pizza");
			System.out.println("Press 2\t Burger");
			System.out.println("Press 3\t Drinks");
			System.out.println("Press 0\t EXIT");

			Scanner sc = new Scanner(System.in);

			int input = sc.nextInt();
			

			if (input == 0) {
				
				System.out.println("---Thankyou-----\nVisit Again!");
				break;
			} else if (input == 1) {
				int pizzaCount=0;
				System.out.println("You have selected pizza");
				pizzaCount++;
				System.out.println("Number of times we selected the option is :"+pizzaCount);
				
				
			} else if (input == 2) {
				int burgerCount=0;
				System.out.println("You have selected Burger");
				burgerCount++;
				System.out.println("Number of times we selected the option is :"+burgerCount);

				
			} else if (input == 3) {
				int drinkCount=0;
				drinkCount++;
				System.out.println("You have selected Drinks "+drinkCount);
				
			} else {
				int invalidCount=0;
				System.out.println("Invalid selected option..");
				invalidCount++;
				
				System.out.println("Number of times you selected the Invalid option is :"+invalidCount);
			}

		}
		

	}

}
