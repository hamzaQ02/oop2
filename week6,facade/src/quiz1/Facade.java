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
public class Facade {
    
    private Method1 method1=new Method1();
    private Method2 method2=new Method2();
    public void operation(){
        method1.m1();
        method2.m2();
    }
    
}
