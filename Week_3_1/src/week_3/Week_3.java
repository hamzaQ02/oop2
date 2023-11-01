/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_3;

/**
 *
 * @author user
 */
public class Week_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p =new Person();
        Person p1=p;
        Person p2=null;
        p.name="Hamza";
        p.SayHello();
        p1.SayHello();
       // p2.SayHello(); Null Pointer Exception //
       Circle c=new Circle();
        System.out.println(c.getRound());
        c.setRad(10);
        System.out.println(c.getArea());
    }
    
}
