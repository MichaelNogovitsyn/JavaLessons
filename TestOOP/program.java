//package TestOOP;

import TestOOP.cat;

public class program {
   public static void main(String[] args) {
    cat bony = new cat();
    bony.name="Bony";
    bony.color = "white";
    bony.age = 1;
    System.out.println( bony.getAge());
    System.out.println(cat.voice(5)); 
    System.out.println(bony.name);
    System.out.println(bony);
    System.out.println("inject="+ bony.getInject());
    System.out.println(" made inject");
    bony.madeIngect();
    System.out.println("inject="+bony.getInject());
   } 
}