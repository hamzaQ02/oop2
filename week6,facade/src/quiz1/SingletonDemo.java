package quiz1;
public class SingletonDemo {

private static SingletonDemo instance;
private SingletonDemo(){

    System.out.println("new objects has been created");

}
public static SingletonDemo Getinstance(){
    
    if (instance==null)
        instance=new SingletonDemo();
    
    return instance;
    
}
public void SayHi(){
    System.out.println("Hi from uncle Singleton!!");
}
public void SayGoodby(){
    System.out  .println("GoodBY sir");
}














}