import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Создайте HashSet заполните его следующими сислами:
 * Создайте LinkedListSet заполните его следующими числами:
 * Создайте TreeSet заполните его следующими числами:
 */

public class Task6_1 {
    public static void main(String[] args) {
        Set hashSet = new HashSet<>(Arrays.asList(1,2,3000,2,4,5000,6,3));
        Set linkSet = new LinkedHashSet<>(Arrays.asList(1,2,3000,2,4,5000,6,3));
        Set treeSet = new TreeSet<>(Arrays.asList(1,2,3000,2,4,5000,6,3));
        System.out.println(hashSet.add(3));
        System.out.println(hashSet.add(30));
        System.out.println(linkSet.add(3));
        System.out.println(linkSet.add(30));
        System.out.println(treeSet.add(3));
        System.out.println(treeSet.add(30));
        System.out.println(hashSet);
        System.out.println(linkSet);
        System.out.println(treeSet);

        Set treeSetSorted = new TreeSet<>(Comparator.reverseOrder());
        treeSetSorted.addAll(treeSet);
        treeSetSorted.add(5);
        System.out.println(treeSetSorted);
    }
}
