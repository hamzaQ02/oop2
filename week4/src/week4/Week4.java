/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author user
 */
public class Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Student std1 = new Student();
        std1.setId(10);
        std1.getName("ahmad");
        std1.setGpa(88);
        Student std2 = new Student(20 ,"ahmad",80,"hamza2002@gmail.com");
      Student std3 =new Student();
        std3.withId(0).withGpa(80);
    }
    
}
