package pdfSolution.Number1.ASSIGNMENT;

public class array1Retry {

    public static void AccessEvenIndexFromArray(int[] a){
        for(int i=0;i<=a.length-1;i+=2){
            System.out.println(a[i]);
        }
    }

    public static void AccessEvenElementFromArray(int[] a){
        int count =0;
        for(int i =0 ; i<=a.length-1;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
                count++;
            }
            else
            {
                System.out.println("Total Odd Element in the Array is:"+a[i]);
                
            }
        }
        System.out.println("Total even Element present in the code is :"+count);
    }
    public static void PrintAndCount3DigitsNumberFromArray(int[] a){
        int count=0;
        for (int i=0;i<=a.length-1;i++){
            if(a[i]>=100 && a[i]<=999){
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.println("Total 3 Digits numbers are: "+count);
    }

    public static void PrintAvgOfAllElementFromArray(double[] a){
        double avg =0;
        for(int i=0;i<=a.length-1;i++ ){
            avg=a[i]/a.length;
            System.out.println("Avg is :"+avg);
        }

    }
    public static void PrintSumOfAllElementFromArray(int[] a){
        int sum = 0;
        for (int i=0;i<=a.length-1;i++){
           sum+=a[i];
        }
         
            System.out.println("sum of all element in the array is :"+sum);
    }
public static void PrintAndCountElementBiggerThanAvgValue(int[] a){
   int avg;
    for(int i = 0;i<=a.length-1;i++){
       avg = a[i]/a.length+1;
       for(int j=0 ; j<=a.length-1;j++){
        int
       }
    }
}
//ques 20 
// // int[] this is used as return type of method which is used to return the complete arrays
// public static int[] StorePrimeInArray(int n){
// int primes[5]=new int[n];
// int index=0;
// for(int i=2; ;i++){
//     if (isPrime(i)) {
//         primes[index++]=i;
        
        
//     }
// }
// }

/*--------------to store fabonacci (LC - 509)  ----------------*/




/*------------------------------------------ */
    public static void main(String[] args) {
        double array[]={10, 20, 40, 5, 15, 45,777,545};
        int arr[]={10, 20, 30,0};
        // AccessEvenIndexFromArray(arr);
        // AccessEvenElementFromArray(array);
        // PrintAndCount3DigitsNumberFromArray(array);
        // PrintAvgOfAllElementFromArray(array);
        PrintSumOfAllElementFromArray(arr);
        
    }
    
}
