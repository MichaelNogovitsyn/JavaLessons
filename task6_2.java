import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class task6_2 {

    public static Double procentDouble(ArrayList arr) {
        Set set = new HashSet<>(arr);
        double res = ((double)(set.size())/(arr.size())*100);

        return res;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n=150;

        ArrayList<Integer> array = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            array.add(rand.nextInt(100));
        }
       // System.out.println(array);
        double procent = 0;
        procent = procentDouble(array);
        System.out.printf("%.1f%%",procent);
    }
}
