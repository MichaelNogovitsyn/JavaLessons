public class Main {
    public static void main(String[] args) {
        int num[] = {4, 8, 16, 32, 64, 128, 256, 515};
        int num2[] = {2, 0, 4, 4, 0, 8};
        try {
            for (int i = 0; i < num.length; i++) {
                try {
                    System.out.println(num[i] + " / " + num2[i] + " = " + num[i] / num2[i]);
                } catch (ArithmeticException e) {
                    System.out.println("попытка деления на 0 или выход за границы");


                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("  exit of bound");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println( e.toString());

        }
    }
}





