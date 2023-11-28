
package quiz1;

import java.util.Scanner;


public class Admin extends SalaryCalculater{
    Scanner s =new Scanner(System.in);
    double salary;
   
@Override
public  void m1(){
    int  x=10;
    System.out.println(x);
}
    
@Override
    public double  cal( ){
         System.out.println("enter your monthly salray");
        salary=s.nextDouble();
        salary=salary*12;
        System.out.println("your yearly salary is  "   );
        return salary;
    }
    
}
