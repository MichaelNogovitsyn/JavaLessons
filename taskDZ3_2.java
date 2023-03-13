import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Задан целочисленный список ArrayList. Найти минимальное, 
максимальное и среднее ариф. из этого списка. */

/**
 * taskDZ3_2
 */
public class taskDZ3_2 {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList(Arrays.asList(2, 5, 8, 6, 21, 2, 0, 4, 5, 24, 54, 2));

        int max = 0;
        int min = 0;
        int average = 0;
        max = Collections.max(intList);
        min = Collections.min(intList);
        int sum = 0;
        for (Integer integer : intList) {
            sum+=integer;           
        }
        average=sum/intList.size();
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        System.out.println("average = "+average);
    }
}