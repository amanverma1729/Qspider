import java.util.Scanner;

public class LowerToUpper {

    String convertCase(String ch) {
        // If string is already lowercase
        if (ch.equals(ch.toLowerCase())) {
            return ch.toUpperCase();
        } 
        // Otherwise return the same Alphabets
        else {
            return ch;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LowerToUpper obj = new LowerToUpper();
        String result = obj.convertCase(input);

        System.out.println("Converted: " + result);
    }
}