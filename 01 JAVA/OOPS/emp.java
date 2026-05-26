// variable shadowing start from 12 may 2026

package OOPS;

public  class emp {
 emp ( String name,int emp_id,int age,String email,long Phone_no){
   this.name=name;
   this.emp_id =emp_id;
   this.age=age;
   this.email=email;
   this.Phone_no=Phone_no;


    }
void display(){
System.out.println("Employee Name :"+name);
System.out.println("Emp id: "+id);
System.out.println("Emp Age: "+age);
System.out.println("Emp email: "+email);
System.out.println("Emp Contact no. :"+Phone_no);

      
    
    }
    public static void main(String[] args) {
        emp e1 = new emp("Aman", 88, 22,"ac54@gmail.com",8985856545L );
        e1.display();

    }
}
