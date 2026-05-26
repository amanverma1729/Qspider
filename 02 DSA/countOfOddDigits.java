public class countOfOddDigits {
    public static void main(String[] args) {
        int n = 54786;
        int count = 0;
        while (n>0) {
            int rem = n % 10;
            if (rem % 2 != 0) {
              System.out.println(rem);  
              count+=1;

            }
        n = n/10;
       
        }
       
         System.out.println("Total odd number in the given digits: "+count);
    }
}

    

