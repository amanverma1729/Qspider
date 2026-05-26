public class smallestAndBiggerDifference {
    public static void main(String[] args) {
        int n = 42375;
        int smallest = 9;
        int biggest = 0;
        while (n>0) {
            int digit = n % 10;
            if (smallest < digit) {
                smallest = digit;
               
            }
            if(biggest<digit){
                biggest=digit;
                
                
            }
            n = n/10;
        }
        System.out.println(smallest);
        System.out.println(biggest);
        // int diff = biggest-smallest;
        // System.out.println("Difference between smallest and biggest digit is : "+diff);

    }
    
}
