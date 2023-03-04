//Дан массив двоичных чисел, например[0,1,0,1,1,1]
//Вывести максимальное количество подряд идущих 1.
public class task2 {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,1,0,1,1,1,1};
        int count=0;
        int max=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 1) { 
                count++;
            }
            else {
                if (max<count) max=count;
                count=0;
            }
        }
        if (max<count) max=count;
        System.out.println(max);
    }
}
