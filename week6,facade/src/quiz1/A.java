/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author user
 */
public class A{
   
    public void m1(){
        System.out.println("Hello from A");
    }
      public void m3(){
        System.out.println("Hello from A");
    }
    
     public A create(){
           A a2=new B();
           System.out.println("create from A  ");
           return a2;
        }
    
}
