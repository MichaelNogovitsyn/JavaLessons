import java.util.Arrays;

/* Данн массив чисел nums=[3,2,2,3,4,5,3] и число val=3;
Если в массиве есть числа, равные заданному, нужно перенести эти 
элементы в конец массива. Таким образом первые несколько (или все)
элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */
public class task3 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 2, 3, 4, 5, 3, 5 };
        int val = 3;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == val) {
                    //temp = array[j];
                    array[j] = array[i];
                    array[i] = val;
                }
            }
        }

        System.out.print(Arrays.toString(array));

    }

}
