//package TestOOP;

//import java.util.*;

public class cat {
    String name;
    String color;
    String gender;
    boolean inject=false;
    int age;
    int id;

    @Override
    public String toString() {
        
        return name+" "+color;
    }
    public static String voice(int num) {
        String voice="";
        for (int i = 0; i < num; i++) {
            voice+="Miayy-";         
        }
        return voice;
    }
    public int getAge() 
    {
        return age;
    }
    public boolean getInject() {
        return inject;
    }
    public void madeIngect() {
        inject=true;
        
    }
}