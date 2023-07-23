import java.util.Scanner;

public class RBTree {
    private static MyNode root = null;

    // Функция для поворота узла против часовой стрелки.
    MyNode rotateLeft(MyNode myNode) {
        System.out.printf("поворот влево!!\n");
        MyNode child = myNode.right;
        MyNode childLeft = child.left;

        child.left = myNode;
        myNode.right = childLeft;

        return child;
    }

    // Функция для поворота узла по часовой стрелке.
    MyNode rotateRight(MyNode myNode) {
        System.out.printf("вращение вправо\n");
        MyNode child = myNode.left;
        MyNode childRight = child.right;

        child.right = myNode;
        myNode.left = childRight;

        return child;
    }

    // Функция для проверки того, является ли узел красного цвета или нет.
    boolean isRed(MyNode myNode) {
        if (myNode == null) {
            return false;
        }
        return (myNode.color == true);
    }

    // Функция для изменения цвета двух узлы.
    void swapColors(MyNode node1, MyNode node2) {
        boolean temp = node1.color;
        node1.color = node2.color;
        node2.color = temp;
    }

    // вставка в левостороннее Красно-черное дерево.
    MyNode insert(MyNode myNode, int data) {
// Обычный код вставки для любого двоичного файла
        if (myNode == null) {
            return new MyNode(data);
        }

        if (data < myNode.data) {
            myNode.left = insert(myNode.left, data);
        } else if (data > myNode.data) {
            myNode.right = insert(myNode.right, data);
        } else {
            return myNode;
        }

// случай 1.
        // когда правый дочерний элемент красный, а левый дочерний элемент черный или не существует.
        if (isRed(myNode.right) && !isRed(myNode.left)) {
// Повернуть узел  влево
            myNode = rotateLeft(myNode);

// Поменять местами цвета дочернего узла всегда должен быть красным
            swapColors(myNode, myNode.left);
        }

// случай 2
        // когда левый ребенок, а также левый внук выделены красным цветом
        if (isRed(myNode.left) && isRed(myNode.left.left)) {
// Повернуть узел вправо
            myNode = rotateRight(myNode);
            swapColors(myNode, myNode.right);
        }

// случай 3
        // когда и левый, и правый дочерние элементы окрашены в красный цвет.
        if (isRed(myNode.left) && isRed(myNode.right)) {
// Инвертировать цвет узла это левый и правый дети.
            myNode.color = !myNode.color;

// Изменить цвет на черный.
            myNode.left.color = false;
            myNode.right.color = false;
        }

        return myNode;
    }

    // Обход по порядку
    void inorder(MyNode node) {
        if (node != null)
        {
            inorder(node.left);
            char c = '●';
            if (node.color == false)
                c = '◯';
            System.out.print(node.data + ""+c+" ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {

        RBTree node = new RBTree();
        Scanner scan = new Scanner(System.in);

        char ch;
        do {
            System.out.println("Введите целое число: ");

            int num = scan.nextInt();
            root = node.insert(root, num);

            node.inorder(root);
            System.out.println("\nВы хотите продолжить?:  Y/N");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}
