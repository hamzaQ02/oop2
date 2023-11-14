package week5_1;
public class Singleton {
    private  static Singleton instance=new Singleton();
    private Singleton(){
        System.out.println("New object has been created");
        
    }
    public static Singleton  getInstance(){
     
        return instance;
    }
    public  void Hello(){
        System.out.println("Hello from Singleton");
    }
            
    
    
}
