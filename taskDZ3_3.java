import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//(Дополнительно) Реализовать алгоритм сортировки слиянием
/* 
1.Массив делится пополам — на левую и правую половины.
2.Элементы разбиваются на группы.
3.На первой итерации это двойки элементов (1-й элемент левой половины + 1-й элемент 
правой половины, 2-й элемент левой половины + 2-й элемент правой половины и т.д.), 
на второй итерации — четвёрки элементов 
(1-й и 2-й элементы левой половины + 1-й и 2-й элементы правой половины, 
3-й и 4-й элементы левой половины + 3-й и 4-й элементы правой половины и т.д.), 
на третьей — восьмёрки и т.д.
4.Элементы каждой группы из левой половины являются отсортированным подмассивом, 
элементы каждой группы из правой половины также являются отсортированным подмассивом.
5.Производим слияние отсортированных подмассивов из предыдущего пункта.
6.Возвращаемся в пункт 1. Цикл продолжается до тех пор, пока размеры групп 
меньше размера массива. */
public class taskDZ3_3 {

    public static int[] mergeArray(int[] arrayA, int[] arrayB) {

        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[i - positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[i - positionA];
                positionA++;
            } else if (arrayA[i - positionA] < arrayB[i - positionB]) {
                arrayC[i] = arrayA[i - positionA];
                positionB++;
            } else {
                arrayC[i] = arrayB[i - positionB];
                positionA++;
            }
        }
        return arrayC;
    }

    public static int[] sortArray(int[] arrayA) { // сортировка Массива который передается в функцию
        // проверяем не нулевой ли он?
        if (arrayA == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }
        // копируем левую часть от начала до середины
        int[] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую
        // часть
        int[] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет
        // крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет
        // искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC);
    }

    public static void main(String[] args) {
        int size = 16;
        ArrayList<Integer> array = new ArrayList(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array.add(rand.nextInt(100));
        }
        Integer notSortArray[] = array.toArray(new Integer[array.size()]);
        System.out.println(Arrays.toString(notSortArray));
/*         int[] SortedArray = new int[size]; 

        SortedArray= sortArray(notSortArray);
        System.out.println(Arrays.toString(SortedArray)); */
        Merge testMerge = new Merge();
        int [] result = taskDZ3_3.sortArray(new int[]{2,3,1,4,2,5,9,3});

        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i] + " ");}
        
    }
}
