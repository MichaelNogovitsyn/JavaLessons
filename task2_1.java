import java.util.Scanner;

/* Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, которая состоит из 
чередующихся символов c1 и c2, начиная с c1. */

public class task2_1 {
    
    public static String builders(String a, String b,int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N/2; i++) {
            sb.append(a);
            sb.append(b);    
        } 
        return sb.toString();   
    }
   
    public static void main(String[] args) {
        String a = "c1";
        String b = "c2";
        Scanner iScanner = new Scanner(System.in); 
        System.out.println("Enter number N: ");
        int N = iScanner.nextInt(); 
        System.out.println(builders(a, b, N));
        iScanner.close();
    }
}
