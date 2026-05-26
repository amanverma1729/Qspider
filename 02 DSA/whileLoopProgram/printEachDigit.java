
/* Write a java program to take a user input and print each
digits of the number one by one from right to left.*/ 

package whileLoopProgram;

public class printEachDigit {
    public static void main(String[] args) {
        int n =154;
        while (n>0) {
            int rem = n % 10;
            System.out.println(rem);


         n = n / 10;

        }
    }
    
}
