import java.util.Scanner;

public class containGivenCharOrNot {

    // Method should be here (outside main)
    boolean containsChar(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("Enter the Char you want to find out: ");
        char ch = sc.next().charAt(0);

        containGivenCharOrNot t = new containGivenCharOrNot();

        // Call the method instead of redefining it
        boolean result = t.containsChar(str, ch);

        if (result) {
            System.out.println("Character found");
        } else {
            System.out.println("Character not found");
        }
    }
}