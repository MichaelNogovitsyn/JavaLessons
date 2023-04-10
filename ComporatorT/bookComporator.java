package ComporatorT;
import java.util.Comparator;

public class bookComporator implements Comparator<Bookm>{
@Override
public int compare(Bookm o1, Bookm o2) {
    // TODO Auto-generated method stub
     if(o1.pages > o2.pages)
     {
        return 1;
     }
     else return -1;
}
}
