import java.util.ArrayList;
import java.util.LinkedList;

// Замерьте время, за которое в ArrayList добавятся 100000 элементов.
// Замерьте время, за которое в LinkedList добавятся 1000000 элементов.
public class task4_1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> Arr = new ArrayList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000 ; i++) {
            Arr.add(0,1);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.printf("Time ArrayList = %d\n",timeFinish-timeStart);

        LinkedList<Integer> ll = new LinkedList<Integer>();
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000 ; i++) {
            ll.add(0,1);
        }
        timeFinish = System.currentTimeMillis();
        System.out.printf("Time LinkedList = %d",timeFinish-timeStart);
        System.out.println(timeFinish);
    }
}
