public class SecondMaxDistinct {
    public static void main(String[] args) {

        int[] a = {10, 20, 50, 60,99, 8, 99};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int n : a) {

            // new maximum found
            if (n > max) {
                secondMax = max;
                max = n;
            }

            // update second maximum
            else if (n > secondMax && n!=max) {
                secondMax = n;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Second Maximum = " + secondMax);
    }
}
    

