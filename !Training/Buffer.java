import java.io.*;
 
public class Buffer {
 
    public static void main(String[] args) {
        
        try(BufferedReader br = new BufferedReader (new FileReader("notes4.txt")))
        {
           // чтение посимвольно
            int c;
            while((c=br.read())!=-1){
                 
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}