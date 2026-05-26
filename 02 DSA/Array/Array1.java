package pdfSolution.Number1.ASSIGNMENT;

import pdfSolution.Number1.sol1;

public class Array1 {


    public static void checkAndPrintEvenIndexElement(int array[]){
        int count = 0;
        for(int i=0;i<=(array.length-1);i++){
        if(i % 2 ==0){
            System.out.println(array[i]);
            count ++;

        }

    }
    System.out.println("Even index element are: "+count);
}
//1. wap to access all the even elements from the arrray
public static void checkAndPrintEvenNumberFromArray(int array[]){
    int count = 0;
        for(int i=0;i<=(array.length-1);i++){
        if(array[i] % 2 ==0){
            System.out.println(array[i]);
            count ++;

        }
    }
    System.out.println("Total even number in the array are: "+count);

}

public static void AccessFromEnd(int array[]){
    int end =array.length-1;
    for (int i = end;i<=0;i--){
        System.out.println(array[i]);
    }

}
public static void countAllElementFromArray(int array[]){
    // for(int i =0 ;i<=array.length-1;i++){
    //     System.out.println(array[i]);
    // }
    
    /*======By enhance for loop =======*/
    for (int i :array){
        System.out.println(i);
    }
}
public static void AvgOFAllArraysElements(int array[]){
    for(int i=0;i<=array.length;i++){
        int avg =array[i]/(array.length);
        System.out.println(avg);
    }
}
public static void SumOfAllElements(int array[]){
   int sum =0;
    for(int i =0 ;i<=array.length-1;i++){
        
        
        sum = sum+array[i];
       
}
 System.out.println("Sum is:"+sum);
}

public static void PrintBiggestAndSmallestFromArray(int array[]){
    int big=array[0],small=array[0];
    for(int a :array){
        if(a>big){
            big = a;
        }
        else if (a<small){
            small=a;
        }
    }
System.out.println("Biggest number is : "+big);
System.out.println("Smallest Number is :"+small);
}

//=======================
public static void PrintBiggestStringFromArray(String person[]){
    String big= person[0];
    for(String s : person){
        if(s.length()>big.length()){
            big =s;
        }
    }
    System.out.println("biggest string is :"+big);
}
//============================
public static boolean isMonotonic(int[] nums) {
      for (int i = 0; i<nums.length;i++){
        if(nums[i-1]>=nums[i]){
            return false;
        }

      }
       return true ;
    }
    //=================
    public static boolean isSorted(int[] a) {
      for (int i = 1; i<a.length;i++){
        if(a[i-1]>a[i]){
            return false;
        }

      }
       return true ;
    }
    //=====================
    public static int StorePrime(int n){
        int[] primes = new int[n];
        int index =0;
        for (int i =2;   ;i++){
            if (isPrime(i)){
                primes[index++]=1;
                // primes[1];
                if(index==n){
                    return primes;
                }

            }
        }
    }
public static void main(String[] args) {

int arr[]={10 , 15 , 60 , 80, 85 ,100};  
String name[]={"Aman", "Rohan","Vickey","Sid","sarthak","ajay","MayankPatel"};
// checkAndPrintEvenIndexElement(arr);
// AccessFromEnd(arr);
// checkAndPrintEvenIndexElement(arr);
// countAllElementFromArray(arr);
// AvgOFAllArraysElements(arr);
// SumOfAllElements(arr);
// PrintBiggestAndSmallestFromArray(arr);
// PrintBiggestStringFromArray(name);
// isMonotonic(arr);
isSorted(arr);


}

}
