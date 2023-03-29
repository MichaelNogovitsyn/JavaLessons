public class Bottle extends  Product{
    private double volume;
    public Bottle(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+" "+volume + "l.";
    }
}
