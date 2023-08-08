import java.util.ArrayList;

public class Terminal {
    double acount;
    double balance;
    int SellLots;
    HistoricalDate historicalDate;

    int BuyLots;
    double BasePrice;
    double currentPrice;
    double priceChange;
    double MoneySpendForBuy;
    double MoneySpendForSell;
    double profit;
    double benefit;
    public static int SELL = 1;
    public static int BUY = 0;


    public Terminal(double balance) {
        this.balance = balance;
    }
    public Terminal(double balance, HistoricalDate historicalDate) {
        this.balance = balance;
        ArrayList<Double> historicalPrice = historicalDate.readColumnData();
    }

    public void postOrder(int type, int lots, double price) {
        if (type == BUY) {
            BuyLots += lots;
            this.MoneySpendForBuy += lots * price;
            balance += balance - lots * price;
            System.out.print("BUY   :");
            //System.out.println("Баланс :" + balance);
        }
        if (type == SELL) {
            SellLots += lots;
            this.MoneySpendForSell += lots * price;
            System.out.print("SELL   :");
            balance += balance - lots * price;
        }

        balance -= price * lots;
        currentPrice = price;
        System.out.println(lots + " - лот, " + "цена = " + price);
    }

    public void setPrice(int changedPrice) {
        currentPrice = currentPrice + changedPrice;
        System.out.println("CurrentPrice = " + currentPrice);
    }

    public int getBuyLots() {
        return BuyLots;
    }

    public double getAcount() {
        acount =  currentPrice * BuyLots + (2 * MoneySpendForSell - currentPrice * SellLots) + benefit;
        return acount;
    }

    public double getMoneySpendForBuy() {
        return this.MoneySpendForBuy;
    }

    public double getMoneySpendForSell() {
        return this.MoneySpendForSell;
    }

    public double getProfit() {
        profit = getAcount() - getMoneySpendForBuy() - getMoneySpendForSell();
        return profit;
    }

    public String data() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Ордера: " + getMoneySpendForBuy() + " / " + getMoneySpendForSell() + "\n");
        sb.append(" На счету: " + getAcount() + "\n");
        sb.append(" Профит: " + getProfit() + "\n");
        return sb.toString();
    }

    public void closeBuy(int volLots) {
        if (volLots <= BuyLots) {
            double midleLotPrice = getMoneySpendForBuy() / BuyLots;
            MoneySpendForBuy -= midleLotPrice * volLots;
            benefit += (currentPrice - midleLotPrice) * volLots;
            BuyLots -= volLots;
            balance +=  midleLotPrice * volLots;
            System.out.println(" Close Buy " + volLots + " lot for price = " + currentPrice);
            System.out.println(" Баланс после закрытия " + balance );
        } else System.out.println(" Не достаточное количество лотов");
    }

    public void closeSell(int volLots) {

        if (volLots <= SellLots) {
            double midleLotPrice = getMoneySpendForSell() / SellLots;
            double closePrice = midleLotPrice + (getMoneySpendForSell() / SellLots - currentPrice);
            MoneySpendForSell -= midleLotPrice * volLots;
            SellLots -= volLots;
            benefit += (closePrice - midleLotPrice) * volLots;
            balance += midleLotPrice * volLots;
            System.out.println(" Close Sell " + volLots + " lot for price = " + currentPrice);
        } else System.out.println(" Не достаточное количество лотов");
    }
}

