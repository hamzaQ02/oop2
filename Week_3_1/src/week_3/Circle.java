/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Circle {
    final static double PI=3.14;
    private  int rad;

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
       
        
        if(rad>0){
        this.rad = rad;
        }
        else{
        rad=0;
        }
    }
    
    public  Circle(int rad){
        setRad(rad);
    }
    public Circle(){}
    
    
    
    public  double  getRound(){
         System.out.println("enter a rad value");
          Scanner s=new Scanner(System.in);
        rad=s.nextInt();
       
        double round=2*PI*rad;
        return round;
}
  public  double getArea(){
      double area= PI*rad*rad;
      return  area;
      
  }

}
