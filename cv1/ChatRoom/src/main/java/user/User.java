/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author filip
 */
public class User {
    
    private String name;
    private int age;
    
    User(String name, int age) {
        setName(name);
        setAge(age);
    }
    
    public String getName() {
        return this.name;
    }
    
    public final void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public final void setAge(int age) {
        this.age = age;
    }
    
    
}
