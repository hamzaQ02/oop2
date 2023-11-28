package quiz1;


public class Person {

int id;
String name;
int age;

public Person(){
   
   name="Raya";
};
public  Person(int id,String name,int age){
    
    id=this.id;
    name=this.name;
    age=this.age;
    
}
public  void SayHello(){
    System.out.println("Hello" + "   "+ this.name+"  "+age);
    
}

    
}
