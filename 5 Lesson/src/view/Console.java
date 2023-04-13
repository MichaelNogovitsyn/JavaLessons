package view;

import presenter.Presenter;

import java.util.Scanner;

public class Console implements View{
    private Scanner scanner;
    private Presenter presenter;
    private  boolean work = true;

    public Console() {
        scanner = new Scanner(System.in, "cp866");

    }



    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        while (work) {
            System.out.println("1 - добавить новую запись\n" +
                    "2 - вывести все на экран\n" +
                    "3 - завершить работу");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addRecord();
                    break;
                case "2":
                    viewAll();
                    break;
                case "3":
                    exit();
                    break;
                default:
                    System.out.println("Ошибка ввода");
            }
        }
    }
    private void addRecord(){
        System.out.println("Введите запись");
        String record = scanner.nextLine();
        presenter.addRecord(record);
    }
    private void viewAll(){
        presenter.getRecords();
    }

    private void exit(){
        System.out.println("Работа завершена");
        scanner.close();
        work = false;
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
