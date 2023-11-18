/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q;

/**
 *
 * @author user
 */
public class FactoryTest {
    public  A create(int type){
        if(type==1){
           B b=new B();
           return b ;
    }
       if (type==2){
        C c =new C();
        return  c;
       }
       return create(type);
}
}
class Test{

    public static void main(String[] args) {
        FactoryTest f=new FactoryTest();
        A a1=f.create(1);
        A a2=f.create(2);
        
      a1.m1();
      a2.m1();

}
}