import java.util.ArrayList;
import java.util.Arrays;

public class PiramidaSort {
    public static void main(String[] args) {
        int size = 10;
        int[] nonSortArray = new int[size];
        new RandomizerArray(nonSortArray, 100);
        System.out.println(Arrays.toString(nonSortArray));
        heapSort(nonSortArray);
        System.out.println(Arrays.toString(nonSortArray));
    }

    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);

        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int n, int i) {
        // n - array size, largest - root index, left and right - branch indexes
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;

        }
        if (right < n && array[right] > array[largest]) {
            largest = right;

        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }
}
