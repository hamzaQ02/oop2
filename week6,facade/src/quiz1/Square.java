/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.util.Scanner;

public class Square {
    
    double x;
    Scanner s=new Scanner(System.in);
    
    public Square(double x){
        x=this.x;
    }
    public  double getarea(){
        System.out.println("Enter the lenght side");
        x=s.nextDouble();
        double area=x+x;
        System.out.println("the area =   " );
        return area;
    }
    public  double getPermeter(){
        double permeter=4*x;
        System.out.println("the permeter =  " );
    return permeter;
    }
    public Square(){}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    
}
