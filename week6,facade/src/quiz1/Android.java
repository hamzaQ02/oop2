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
public class Android  extends Phone{

    public Android(String os, String modal, int price) {
        super(os, modal, price);
    }
    
    @Override
    public  double Calprice(){
        
        return price-(price*50/100);
    }
    
}
