 
 public class SecondMax {
    public static void main(String[] args) {
        
    int [] a ={10, 20,50, 60,8,99};
 
   int max =Integer.MIN_VALUE;
        int SecondMax = Intger.MIN_VALUE;
        for (int n : a ) {
            if (n>max){
                SecondMax=max;
                max=n;
            }
            else if(n>SecondMax){
                SecondMax=n;
                System.out.println(SecondMax);
                
            }
            
        } 
 }
 
}