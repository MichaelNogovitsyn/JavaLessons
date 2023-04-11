import javax.naming.spi.DirStateFactory.Result;


public class Notebook {

    int ram = 1;
    int vd = 1;
    String os = "no os";
    String color = " ";
    String model="noname";

    @Override
    public String toString() {
        // String description = "";
        return model + ", " + os + ", " + color + ", " + ram + "GB" +", " + vd+"GB.";
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getVd() {
        return vd;
    }

    public String getModel() {
        return model;
    }

    public void addModel(String name) {
        model = name;
    }

    public void addColor(String colr) {
        color = colr;
    }
    public void addOS(String name) {
        os = name;
    }
    public void addRAM(int name) {
        ram = name;
    }
    public void addVD(int name) {
        vd= name;
    }

}
