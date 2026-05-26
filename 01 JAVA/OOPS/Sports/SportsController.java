package OOPS.Sports;

import java.util.Scanner;

public class SportsController {
    
    public static void main(String[] args) {

        System.out.println("------WELCOME TO SPORTS ARENA------------");

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("\nSELECT any below Sports: ");
            System.out.println("Press 1\t Hockey");
            System.out.println("Press 2\t Cricket");
            System.out.println("Press 3\t Kabaddi");
            System.out.println("Press 0\t EXIT");
            System.out.print("Enter your choice: ");

            int input = sc.nextInt();
            
            if (input == 0) {
                System.out.println("---Thank you-----\nVisit Again!");
                break;
            }

            Sports selectedSport = null;

            if (input == 1) {
                selectedSport = new Hockey();
            } else if (input == 2) {
                selectedSport = new Cricket();
            } else if (input == 3) {
                selectedSport = new Kabaddi();
            } else {
                System.out.println("Invalid selected option..");
                continue;
            }

            
            if (selectedSport != null) {
                
                selectedSport.play();

                System.out.println("\nDetails:");
               
                selectedSport.displayDetails();
                
                System.out.println("\nDetailed Information:");
                selectedSport.displayDetails(true);
            }
        }
        
        sc.close();
    }
}