import java.util.Scanner;

public class task1 {
    
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in,"Cp866");
        System.out.printf("Enter your name: ");
        String name = iScanner.nextLine();

        System.out.printf("Hello!  %s",name);
    }
}
