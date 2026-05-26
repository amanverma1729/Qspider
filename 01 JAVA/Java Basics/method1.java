public class method1 {

    // public static int largestNumber(int x , int y){
    //     if(x>y)
    //         return x;
    //     return y;
    // }

    // public static String inputString(String x , String y){
    //     x="java";
    //     y="developer";
    //     return x+y;
    // }
    //  public static double multiply(float x , float y, float z)
    // // public static double multiply(double x , double y, double z)
    // {
    //    return x * y * z;

    // }
    // public static void main(String[] args) {
    //   System.out.println( largestNumber(8, 89)); 
    //   System.out.println(inputString(null, null));
    //   System.out.println(multiply(7.0f,5.0f , 8.0f));
        
    // }

    public static void main(String[] args) {
        System.out.println("main method called by jvm ");
        long i = 98765L;
        main(i);
    }
    public static void main (int i){
        System.out.println("int");
    }
    public static void main (String i){
        System.out.println("Strings");
    }
}