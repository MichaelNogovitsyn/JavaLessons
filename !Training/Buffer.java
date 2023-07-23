import java.io.*;
 
public class Buffer {
    static String allFile=""; 
    public static void main(String[] args) {
        
        try(BufferedReader br = new BufferedReader (new FileReader("note4.txt")))
        {
           // чтение посимвольно
            int c;
/*             while((c=br.read())!=-1){
                 
                System.out.print((char)c);
            } */
            //чтение построчно
            System.out.println("Чтение посторочно:");
    String s;
    int charCount = -1;
    char[] temp = new char[10];
    String ssss = new String(temp, 0, charCount);
    int line = 1; 

    while((s=br.readLine())!=null){
              
       // System.out.println(line+": "+s);
        line++;
        allFile =allFile+line+s+"\n";
        
        
    }
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("writer.txt")))
        {
            BufferedReader br = new BufferedReader(new FileReader("note4.txt")); 
            String text = "Hello  World!\nHey! Teachers! Leave the kids alone.";
            FileReader reader = new FileReader("note4.txt");
            text = br.readLine();
            bw.write(allFile);
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        } 
    } 
}