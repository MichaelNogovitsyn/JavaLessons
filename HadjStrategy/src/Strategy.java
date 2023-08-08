import static java.lang.Thread.sleep;

public class Strategy {
    Terminal terminal;
    boolean statusRun = false;
    int step;
    double basePrice;
    double procent;

    public Strategy(Terminal terminal) {
        this.terminal = terminal;
    }

    public void startStrategy1() {
       /*  Покупаем 10 лот.

         1: если цена растет до 5%*, закрываем 50%
            иначе если упала на 10% покупаем еще 10 лот
         2: если цена еще выросла на 8%, закрываем еще 50%
            иначе если упала на 5% закрываем все.
         3: если цена выросла 10% закрываем все
            иначе если цена упала до 5% закрываем все.
        */

        if (statusRun == false) {
            statusRun = true;
            step = 1;
            terminal.postOrder(terminal.BUY, 10, terminal.currentPrice);
            basePrice = terminal.currentPrice;
        }
        procent = (double) (terminal.currentPrice - basePrice) / basePrice * 100;
        //System.out.println("Procent = " + procent);
        switch (step) {
            case 1:
                System.out.println("step 1");
                System.out.println("Профит : "+terminal.getProfit());
                if (procent > 5.0) {
                    terminal.closeBuy(terminal.getBuyLots() / 2);
                    terminal.data();
                    step = 2;
                } else if (procent < -10.0) {
                    terminal.postOrder(Terminal.BUY, 10, terminal.currentPrice);
                    step = 2;
                }
                break;
            case 2:
                System.out.println("step 2");
                System.out.println("Профит : "+terminal.getProfit());
                if (procent > 8.0) {
                    step = 3;
                    terminal.closeBuy(terminal.getBuyLots() / 2);

                } else if (procent < 0.0) {
                    terminal.closeBuy(terminal.getBuyLots());
                    step = 8;
                }
                break;
            case 3:
                System.out.println("step 3");
                System.out.println("Профит : "+terminal.getProfit());
                if (procent > 10) {
                    step = 8;
                    terminal.closeBuy(terminal.getBuyLots());

                } else if (procent < 5.0) {
                    terminal.closeBuy(terminal.BuyLots);
                    step = 8;
                }
                break;
            case 8:
                statusRun = false; // start agan
                System.out.println("Поздравляю!!!!!!!!!!");
                System.out.println("Профит по стратегии: "+terminal.getProfit());
                System.out.println("Баланс: " + terminal.balance);
                break;
            case 9:

                break;
        }
    }
}
