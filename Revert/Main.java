public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Добавляем узлы в список
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Исходный список:");
        list.display();

        // Разворачиваем список
        list.reverse();

        System.out.println("Развёрнутый список:");
        list.display();
    }
}