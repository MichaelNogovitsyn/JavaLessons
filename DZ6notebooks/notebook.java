public class Notebook {

    int ram = 1;
    int vd = 1;
    int id = 0;
    String os = "no os";
    String color = " ";
    String model="noname";

    @Override
    public String toString() {
        // String description = "";
        return "Brend - "+model + ", OS - " + os + ", color - " + color + ", Ram - " + ram + "GB" +", HDD - " + vd+"GB.";
    }

    /**
     * @return name OS
     */
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
    public void addID(int name) {
        id= name;
    }
}
