/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author user
 */
public class Student {
   
    private int id;
    private String name;
    private double gpa;
    private String email;
public Student(){


}
    public Student(int id, String name, double gpa, String email) {
        setId(id);
        setName(name);
        setGpa(gpa);
        setEmail(email);

    }

    public Student withId(int id) {
    setId(id);
        return this;
    }
public Student withName(String name) {
    setId(name);
    return this;
}

    public Student withGpa(int gpa) {
    setGpa(gpa);
        return gpa;
    }
    public Student email(String email) {
    setEmail(email);
        return email;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Student widthId() {return null;
}


    
}
