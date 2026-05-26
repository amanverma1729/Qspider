
  import java.util.Scanner;
  public class empDetails {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the Name: ");
//     String name = sc.next() ;
//     System.out.println("Enter E_mail: ");
//     String email = sc.next() ;
//     System.out.println("Enter the Mobile no: ");
//     int mobileNo = sc.nextInt();
//     System.out.println("Enter the Salary: ");
//     int salary = sc.nextInt();
//      System.out.println("Enter the Emp_id: ");
//     int empId = sc.nextInt();
//      System.out.println("Enter the Age : ");
//     int age = sc.nextInt();
//     System.out.println("Enter Blood Group: ");
//     String bloodGroup = sc.next() ;
// System.out.println("============================");
// System.out.println("Details of the emp");
// System.out.println("============================");
// System.out.println("Name: "+name);
// System.out.println("Email: "+email);
// System.out.println("Mobile no: "+mobileNo);
// System.out.println("Salary: "+salary);
// System.out.println("Emp_id"+empId);
// System.out.println("Age: "+age);
// System.out.println("Blood Group: "+bloodGroup);


    System.out.println("Enter the Name: ");
    String name = sc.nextLine() ;

    System.out.println("Enter Address: ");
    String address = sc.nextLine() ;

    System.out.println("Enter the Mobile no: ");
    long mobileNo = sc.nextLong();

     System.out.println("Enter the Age : ");
    int age = sc.nextInt();
    sc.nextLine(); // this is used to empty the buffer and make sure the next 
    System.out.println("College Name");
    String college = sc.nextLine();
    System.out.println(" ");
    System.out.println("==================");
    System.out.println(" ");
   System.out.println("Adress is: "+address);
   System.out.println("Mobile No is: "+mobileNo);
   System.out.println("Name is: "+name);
   System.out.println("Age is: "+age);
   System.out.println("College Name: "+college);

    
//     // 
    



  }
    
  }