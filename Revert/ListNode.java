class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Метод для разворота двусвязного списка
    public void reverse() {
        Node current = head;
        Node temp = null;

        // Поменять местами значения prev и next у всех узлов списка
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // Перейти к следующему узлу
        }

        // Проверить, был ли список пустым
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Метод для добавления нового узла в начало списка
    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    // Метод для отображения списка
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}

