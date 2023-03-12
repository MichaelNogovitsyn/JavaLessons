import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

// Заполнить список десятью случайными числами. Отсортировать список методом sort()
//и вывести его на экран

public class task3_1 {
public static void main(String[] args) {
    ArrayList<Integer> arr =new ArrayList<>();
    Random rand = new Random();
    int count=0;
    while(count<10){
    arr.add(rand.nextInt(100)) ; 
    count++;  
    }
    System.out.println(arr);
    arr.sort(Comparator.naturalOrder());
    System.out.println(arr);
}     
}
