import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class help {
    public static void main(String[] args) {
        float p = 123.3f;
        double d = 112.34d;
        char ch= '{';
        boolean flag =true;
        System.out.println("OK");

        byte b = Byte.parseByte("123");

        Scanner iScanner = new Scanner(System.in);
        int x = iScanner.nextInt();

        //-------------------------Массивы-------------------------\\
        int[] arr = new int[10];
        int arr2[];

        int[][] arr3 = new int[3][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println("%d",arr3[i][j]); 
            }
        }
        String[] splitStr = arr.split("\\D+");
        numbers[i] = Integer.parseInt(splitStr[i]);

        //------------------------Функции--------------------------------\\
        static int sum(int a, int b){
            return a+b;
        }
        //-------------------------Файлы--------------------------------\\\
        //import java.io.FileWriter;
        //import java.io.IOException;
        try (FileWriter fw = new FileWriter("file.txt",false)){
            fw.write("line1");
            fw.append("asd\n");
            fw.flush();               
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        File f1 = new File("file.txt");
      //-------------------------Коллекции--------------------------------\\\
ArrayList list = new ArrayList();
ArrayList<Integer> list2 = new ArrayList<Integer>();
ArrayList<Integer> list3 = new ArrayList<Integer>(10);
ArrayList<String> arr5 = new ArrayList<>(Arrays.asList("Merkury","Venus","Earth"));
ArrayList<Cat> catsList = new ArrayList<>(Arrays.asList(catsArray));
Integer notSortArray[] = array.toArray(new Integer[array.size()]);

list.add(2809);
list.add("Hi");
list.add(3.3);
list.set(2,9);
for (Object o:list){
    System.out.println(o);
    if (list.get(i) instanceof Integer){
        list.remove(i);
        list.clear();
        i--;
}
int index= list.indexOf(3);
Queue<Integer> queue=new LinkedList<Integer>();
queue.add(1);
queue.remove();
      //-------------------------Коллекции Map--------------------------------\\\ 
Map<Integer, String> db = new HashMap<>(100);
Map<Integer, String> db2 = new HashMap<>(100, 1.0f);
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db); 

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }

        Map<String, Collection<Integer>> data = new HashMap<String, Collection<Integer>>();
            data.put(surname, new ArrayList<Integer>());
            data.get(surname).add(phoneNum);
}
    }
}
