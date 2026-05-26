public class greaterOrEqualToGivenDigits {
    public static void main(String[] args) {
        int n=54805; int count=0;
        while (n>0) {
            int rem = n % 10;
            if (rem>=5) {
                System.out.println(rem);
                count+=1;
            }

            n = n/10;
        }
        System.out.println("total digits that is greater of equal to five are: "+count);
    }
    
}
