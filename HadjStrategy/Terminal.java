import java.util.Scanner;

public class Terminal {
    int acount;
    int deposit;
    int SellLots;
    int BuyLots;
    int BasePrice;
    int currentPrice=100;
    int priceChange;
    int moneySpend;
    int profit;
    public static int SELL = 1;
    public static int BUY = 0;

    public Terminal(int deposit) {
        this.deposit = deposit;
    }

    public void deal(int type, int lots, int price) {
        if (type == BUY) {
            BuyLots += 1;
        }
        if (type == SELL) {
            SellLots += 1;
        }
        this.moneySpend += lots * price;
        deposit -= moneySpend;
        currentPrice = price;
        System.out.println("Сделка выполнена:" + "лоты = " + lots+", " + "цена = " + price);
    }

    public void setPrice(int changedPrice) {
        currentPrice = currentPrice + changedPrice;
        System.out.println("CurrentPrice = " + currentPrice);
    }

    public int getAcount() {
        acount = currentPrice * BuyLots;
        return acount;
    }

    public int getMoneySpend() {
        return this.moneySpend;
    }
    public int getProfit() {
        profit = getAcount() - getMoneySpend();
        return profit;
    }

    public String data() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Потрачено: " + getMoneySpend()+ "\n");
        sb.append(" На счету: " + getAcount()+ "\n");
        sb.append(" Профит: " + getProfit() + "\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        Terminal terminal = new Terminal(10000);
        String key = "10";
        Scanner scn = new Scanner(System.in);
        System.out.println(" Введите:\n " +
                "1 - Купить 1 лот\n " +
                "2 - Продать 1 лот\n " +
                "3 - Изменить цену\n " +
                "4 - Вывести данные \n " +
                "5 -  \n " +
                "0 - Выйти");

        while (key != "0") {
            key = scn.next();
            switch (key) {
                case "0":
                    key = "0";
                    break;
                case "1":
                    terminal.deal(BUY, 1, terminal.currentPrice);
                    break;
                case "2":
                    terminal.deal(SELL, 1, 100);
                    break;

                case "3":
                    terminal.setPrice(5);
                    break;
                case "4":
                    System.out.println(terminal.data());
                    break;
                case "5":

                    break;
                case "6":


                    break;
                default:
                    System.out.println("Такой команды нет");
                    break;
            }
        }
    }
}

