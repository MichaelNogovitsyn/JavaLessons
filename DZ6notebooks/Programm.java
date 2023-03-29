
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
import DZ6notebooks.NoteBook;
import java.util.*;

public class Programm {
    public static void main(String[] args) {
        int id = 1;
        Scanner scn = new Scanner(System.in);
        Notebook notebook1 = new Notebook();
        notebook1.addModel("Asus");
        notebook1.addColor("White");
        notebook1.addOS("Windows 10");
        notebook1.addRAM(8);
        notebook1.addVD(120);
        notebook1.addID(id++);

        Notebook notebook2 = new Notebook();
        notebook2.model = "Razer";
        notebook2.color = "Black";
        notebook2.os = "MacOS";
        notebook2.ram = 16;
        notebook2.vd = 256;
        notebook2.addID(id++);

        Notebook notebook3 = new Notebook();
        notebook3.model = "Intel";
        notebook3.color = "Red";
        notebook3.os = "MacOS";
        notebook3.ram = 32;
        notebook3.vd = 512;
        notebook3.addID(id++);

        Notebook notebook4 = new Notebook();
        notebook4.model = "AMD";
        notebook4.color = "Blue";
        notebook4.os = "Windows 11";
        notebook4.ram = 8;
        notebook4.vd = 512;
        notebook4.addID(id++);

        Notebook notebook5 = new Notebook();
        notebook5.model = "Lenovo";
        notebook5.color = "White";
        notebook5.os = "Windows 11";
        notebook5.ram = 16;
        notebook5.vd = 1024;
        notebook5.addID(id++);

        Set<Notebook> noteSet = new HashSet<Notebook>();
        Map<Integer, Notebook> noteFiltered = new HashMap<>();
        noteSet.add(notebook1);
        noteSet.add(notebook2);
        noteSet.add(notebook3);
        noteSet.add(notebook4);
        noteSet.add(notebook5);

        System.out.println(
                "Здравствуйте! Введите цифру, соответствующую необходимому критерию: \n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
        int key = scn.nextInt();
        int minVal = 0;
        String typeOS = "";
        String color = "";
    
        switch (key) {
            case 1:
                System.out.println("Введите минимальный обьем ОЗУ");
                minVal = scn.nextInt();
                for (var note : noteSet) {
                    if (note.ram >= minVal) {
                        noteFiltered.put(note.id, note);
                    }

                }
                break;
            case 2:
                System.out.println("Введите минимальный обьем ЖД");
                minVal = scn.nextInt();
                for (var note : noteSet) {
                    if (note.vd >= minVal) {
                        noteFiltered.put(note.id, note);
                    }
                }
                break;
            case 3:
                System.out.println("Введите тип ОС, Windows или Mac");
                typeOS = scn.next();
                for (var note : noteSet) {
                    if (note.os.toLowerCase().contains(typeOS.toLowerCase())) {
                        noteFiltered.put(note.id, note);
                    }
                }
                break;
            case 4:
                System.out.println("Введите цвет: white, blue, black, red");
                color = scn.next();
                for (var note : noteSet) {
                    if (note.color.toLowerCase().contains(color.toLowerCase())) {
                        noteFiltered.put(note.id, note);
                    }
                }
                break;
            default:
                break;
        }
        if (!noteFiltered.isEmpty()) {
            System.out.println("Вот подходящие модели:");
            for (var item : noteFiltered.entrySet()) {
                System.out.println(item.getValue());
            }
        } else {
            System.out.println("Таких моделей нет");
        }
    }
}
