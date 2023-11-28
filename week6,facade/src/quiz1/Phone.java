/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.util.Scanner;

public class Phone {

String os;
String modal;
int price;
   
public Phone(String os,String modal,int price){
 
    this.modal=modal;
    this.os=os;
    this.price=price;
}


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double Calprice(){
        
        return this.price*5;
    };

    public Phone(String os) {
        this.os = os;
    }
    
}
