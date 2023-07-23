// Программа для реализации операции вставки в красно-черном дереве.

class MyNode {

    MyNode left, right;
    int data;

    // красный ==> true, черный ==> false
    boolean color;

    MyNode(int data) {
        this.data = data;
        left = null;
        right = null;

// Новый узел, который создается, является всегда красного цвета.
        color = true;
    }
}