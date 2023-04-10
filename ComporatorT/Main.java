package ComporatorT;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        //bookComporator comporator = new bookComporator();
        Bookm b1 = new Bookm("1",100);
        Bookm b2 = new Bookm("2",10);
        Bookm b3 = new Bookm("3",30);
        List<Bookm> books = new ArrayList<>(List.of(b1,b2,b3));
        System.out.println(books);      
        Collections.sort(books);   
        System.out.println(books);
    }
}
