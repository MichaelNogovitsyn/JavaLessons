import java.util.ArrayList;
import java.util.Random;

public class piramSort {
    public static void main(String[] args) {
        System.out.println("Hello");
        Random rnd = new Random();
        int size = 10;
        ArrayList nonSort = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
          nonSort.add(rnd.nextInt(10));  
        }
        
        System.out.println(nonSort);
}
}
