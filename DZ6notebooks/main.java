import java.util.Scanner;

/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих */

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Notebook notebook1 = new Notebook();
        notebook1.addModel("Asus");
        notebook1.addColor("White");
        notebook1.addOS("Windows 10");
        notebook1.addRAM(8);
        notebook1.addVD(120);

        Notebook notebook2 = new Notebook();
        notebook2.model = "Razer";
        notebook2.color = "Black";
        notebook2.os = "MacOS";
        notebook2.ram = 16;
        notebook2.vd = 256;

        Notebook notebook3 = new Notebook();
        notebook3.model = "Intel";
        notebook3.color = "Red";
        notebook3.os = "MacOS";
        notebook3.ram = 32;
        notebook3.vd = 512;

        Notebook notebook4 = new Notebook();
        notebook4.model = "AMD";
        notebook4.color = "Blue";
        notebook4.os = "Windows 11";
        notebook4.ram = 8;
        notebook4.vd = 512;

        Notebook notebook5 = new Notebook();
        notebook5.model = "Lenovo";
        notebook5.color = "White";
        notebook5.os = "Windows 11";
        notebook5.ram = 16;
        notebook5.vd = 1024;

        
        System.out.println("Здравствуйте! Введите цифру, соответствующую необходимому критерию: \n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");         
        int key = scn.nextInt();
        int minVal;
        switch (key) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                break;
        }
    }
}
