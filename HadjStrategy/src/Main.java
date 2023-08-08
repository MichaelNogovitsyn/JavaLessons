import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Main {
    public static int SELL = 1;
    public static int BUY = 0;


    public static void main(String[] args) throws InterruptedException {
        String key = "10";
        String csvFile = "E:\\уроки\\Java\\HadjStrategy\\src\\main\\resources\\data.csv"; // Замените на путь к вашему CSV файлу
        int column = 3; // Замените на номер нужной вам колонки (начиная с 0)
        HistoricalDate historicalDate = new HistoricalDate(csvFile, column);
        ArrayList<Double> priceHistory = historicalDate.readColumnData();
        Terminal terminal = new Terminal(10000, historicalDate);
        Strategy strategy = new Strategy(terminal);


//        // Вывод данных колонки на экран
//        for (Double data : columnData) {
//            System.out.println(data);
//        }

        Scanner scn = new Scanner(System.in);
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(() -> {
            getPriceHistory(terminal, priceHistory);
            strategy.startStrategy1();


        }, 0, 1000, TimeUnit.MILLISECONDS);

        System.out.println("Баланс : " + terminal.balance);
        while (key != "0") {
            view();
            key = scn.next();
            switch (key) {
                case "0":
                    key = "0";
                    executor.shutdown();
                    break;
                case "1":
                    terminal.postOrder(BUY, 1, terminal.currentPrice);
                    break;
                case "2":
                    terminal.postOrder(SELL, 1, terminal.currentPrice);
                    break;
                case "3":
                    getPriceHistory(terminal, priceHistory);
                    //terminal.setPrice(4);
                    break;
                case "4":
                    terminal.setPrice(-4);
                    break;
                case "5":
                    System.out.println(terminal.data());
                    break;
                case "6":
                    terminal.closeBuy(1);
                    break;
                case "7":
                    terminal.closeSell(1);
                case "8":
                    strategy.startStrategy1();
                    break;
                default:
                    System.out.println("Такой команды нет");
                    break;
            }
        }
    }

    public static void run(Strategy strategy) {

        strategy.startStrategy1();

    }

    public static void getPriceHistory(Terminal terminal, ArrayList<Double> historyPrices) {
        terminal.currentPrice = historyPrices.get(0);
        System.out.println("Текущая цена: " + historyPrices.get(0));
        historyPrices.remove(0);

    }

    ///////////
    public static void view() {
        System.out.println(" Введите:\n " +
                "1 - Купить Buy лот\n " +
                "2 - Купить Sell  лот\n " +
                "3 - Повысить цену\n " +
                "4 - Понизить цену\n " +
                "5 - Вывести данные\n " +
                "6 - Закрыть Buy lot\n " +
                "7 - Закрыть Sell lot\n " +
                "8 - Запустить стратегию\n " +
                "0 - Выйти");
    }
}
