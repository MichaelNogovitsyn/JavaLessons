package TestTask;
import java.util.Arrays;

/*      Этот код реализует скользящий буфер на 10 последних значений 
        и отсекает минимальное и максимальное значение. 
        Затем он вычисляет медиану, среднее арифметическое и дисперсию по 
        оставшимся значениям. */

    public class Buffer {
        private static final int BUFFER_SIZE = 10;
        private int[] buffer = new int[BUFFER_SIZE];
        private int index = 0;
    
        public void PutData(int input) {
            buffer[index] = input;
            index = (index + 1) % BUFFER_SIZE;
    
            int[] sortedBuffer = Arrays.copyOf(buffer, BUFFER_SIZE);
            Arrays.sort(sortedBuffer);
    
            double median = (sortedBuffer[BUFFER_SIZE / 2] + sortedBuffer[(BUFFER_SIZE - 1) / 2]) / 2.0;
            double sum = 0;
            for (int i = 1; i < BUFFER_SIZE - 1; i++) {
                sum += sortedBuffer[i];
            }
            double mean = sum / (BUFFER_SIZE - 2);
            double variance = 0;
            for (int i = 1; i < BUFFER_SIZE - 1; i++) {
                variance += (sortedBuffer[i] - mean) * (sortedBuffer[i] - mean);
            }
            variance /= (BUFFER_SIZE - 3);
    
            System.out.println("Медиана: " + median);
            System.out.println("Среднее: " + mean);
            System.out.println("Дисперсия: " + variance);
        }
    }