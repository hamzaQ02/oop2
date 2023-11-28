/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Os  extends Phone{
    
     Scanner s=new Scanner(System.in);

    public Os(String os, String modal, int price) {
        super(os, modal, price);
    }

    
    @Override
    public  double Calprice(){
        return price*2;
    }

  
    
}
