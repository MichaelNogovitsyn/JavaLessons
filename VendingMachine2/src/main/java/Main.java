public class Main {
    public static void main(String[] args) {
        Product product = new Product("Twix",100);
        System.out.println(product);
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(product);
        Bottle bottle = new Bottle("Aqua", 120,2);
        System.out.println(bottle);
    }
}

