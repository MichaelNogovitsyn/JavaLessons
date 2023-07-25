import java.util.Scanner;

public class Terminal {
    int acount;
    int deposit;
    int SellLots;
    int BuyLots;
    int BasePrice;
    int currentPrice = 100;
    int priceChange;
    int MoneySpendForBuy;
    int MoneySpendForSell;
    int profit;
    int benefit;
    public static int SELL = 1;
    public static int BUY = 0;

    public Terminal(int deposit) {
        this.deposit = deposit;
    }

    public void deal(int type, int lots, int price) {
        if (type == BUY) {
            BuyLots += 1;
            this.MoneySpendForBuy += lots * price;
            System.out.print("BUY   :");
        }
        if (type == SELL) {
            SellLots += 1;
            this.MoneySpendForSell += lots * price;
            System.out.print("SELL   :");
        }

        deposit -= price * lots;
        currentPrice = price;
        System.out.println(lots + " - лот, " + "цена = " + price);
    }

    public void setPrice(int changedPrice) {
        currentPrice = currentPrice + changedPrice;
        System.out.println("CurrentPrice = " + currentPrice);
    }

    public int getAcount() {
        acount = currentPrice * BuyLots + (2 * MoneySpendForSell - currentPrice * SellLots)+benefit;
        return acount;
    }

    public int getMoneySpendForBuy() {
        return this.MoneySpendForBuy;
    }

    public int getMoneySpendForSell() {
        return this.MoneySpendForSell;
    }

    public int getProfit() {
        profit = getAcount() - getMoneySpendForBuy() - getMoneySpendForSell();
        return profit;
    }

    public String data() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Потрачено: " + getMoneySpendForBuy() + " / " + getMoneySpendForSell() + "\n");
        sb.append(" На счету: " + getAcount() + "\n");
        sb.append(" Профит: " + getProfit() + "\n");
        return sb.toString();
    }

    public void closeBuy() {
        int countLots = 1; // добавить в параметр функции
        int midleLotPrice=getMoneySpendForBuy()/BuyLots;
        MoneySpendForBuy-=midleLotPrice*countLots;
        benefit += currentPrice-midleLotPrice;
        BuyLots -= 1;

        System.out.println(" Close Buy lot for price = "+currentPrice);
    }

    public void closeSell() {
        int countLots = 1; // добавить в параметр функции
        int midleLotPrice = getMoneySpendForSell()/SellLots;
        int closePrice= midleLotPrice + (getMoneySpendForSell()/SellLots - currentPrice);
        MoneySpendForSell-=midleLotPrice*countLots;
        SellLots -= 1;
        benefit +=closePrice-midleLotPrice;
        System.out.println("Close Sell lot for price = " + closePrice);
    }

    public void view() {
        System.out.println(" Введите:\n " +
                "1 - Купить Buy лот\n " +
                "2 - Купить Sell  лот\n " +
                "3 - Повысить цену\n " +
                "4 - Понизить цену\n " +
                "5 - Вывести данные\n " +
                "6 - Закрыть Buy lot\n " +
                "7 - Закрыть Sell lot\n " +
                "0 - Выйти");
    }

    public static void main(String[] args) {
        Terminal terminal = new Terminal(10000);
        String key = "10";
        Scanner scn = new Scanner(System.in);
        while (key != "0") {
            terminal.view();
            key = scn.next();
            switch (key) {
                case "0":
                    key = "0";
                    break;
                case "1":
                    terminal.deal(BUY, 1, terminal.currentPrice);
                    break;
                case "2":
                    terminal.deal(SELL, 1, terminal.currentPrice);
                    break;

                case "3":
                    terminal.setPrice(5);
                    break;
                case "4":
                    terminal.setPrice(-5);
                    break;
                case "5":
                    System.out.println(terminal.data());
                    break;
                case "6":
                    terminal.closeBuy();

                    break;
                case "7":
                    terminal.closeSell();

                    break;
                default:
                    System.out.println("Такой команды нет");
                    break;
            }
        }
    }

}

