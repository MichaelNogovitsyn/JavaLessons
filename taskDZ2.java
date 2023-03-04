//Вывести все простые числа от 1 до 1000
public class taskDZ2 {
    public static void main(String[] args) {
        int n = 1000;
        int i = 0;
        boolean isprostoe = false;
        System.out.println("2");
        for (i = 1; i <= n; i++) {
            for (int j = 2; j < n; j++) {
                if (j >= i / 2) {
                    break;
                }
                if (i % j != 0) {
                    isprostoe = true;
                } else {
                    isprostoe = false;
                    break;
                }
            }
            if (isprostoe) {
                System.out.println(i);
            }

        }
    }
}
