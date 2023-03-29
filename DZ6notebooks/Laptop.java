import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Laptop {
    private int ram;
    private int hdd;
    private String os;

    public Laptop(int ram, int hdd, String os) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(8, 256, "Windows"));
        laptops.add(new Laptop(16, 512, "MacOS"));
        laptops.add(new Laptop(4, 128, "Linux"));

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int ram = random.nextInt(16) + 1;
            int hdd = random.nextInt(1024) + 1;
            String os = "";
            int osNumber = random.nextInt(3);
            if (osNumber == 0) {
                os = "Windows";
            } else if (osNumber == 1) {
                os = "MacOS";
            } else if (osNumber == 2) {
                os = "Linux";
            }
            laptops.add(new Laptop(ram, hdd, os));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальное количество ОЗУ: ");
        int ram = scanner.nextInt();
        System.out.println("Введите минимальный объем жесткого диска: ");
        int hdd = scanner.nextInt();
        System.out.println("Введите тип операционной системы: ");
        String os = scanner.next();

        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getRam() >= ram && laptop.getHdd() >= hdd && laptop.getOs().equals(os)) {
                filteredLaptops.add(laptop);
            }
        }

        if (filteredLaptops.isEmpty()) {
            System.out.println("Ноутбуков не найдено.");
        } else {
            for (Laptop laptop : filteredLaptops) {
                System.out.println("Найден ноутбук: " + laptop);
            }
        }
    }
}