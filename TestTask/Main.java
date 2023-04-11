package TestTask;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* Этот код создает экземпляр класса Buffer и запускает планировщик задач 
с фиксированным интервалом в 100 мс. 
При каждом вызове планировщика он вызывает метод PutData класса Buffer 
с новым значением для обработки. */

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        final Random random = new Random();
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(() -> {          
            int newValue = random.nextInt(); // здесь принимаем новое значение обработки
            buffer.PutData(newValue);
        }, 0, 100, TimeUnit.MILLISECONDS);
    }
}
