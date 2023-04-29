//Вывести все простые числа от 1 до 1000
public class taskDZ2 {
    public static void main(String[] args) {
        final int  N = 1000;
        int i = 0;
        boolean isprostoe = false;
        System.out.println("2");
        for (i = 1; i <= N; i++) {
            for (int j = 2; j < N; j++) {
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
