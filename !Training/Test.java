import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Test {

    int x;
    void Test(){};
    public static void main(String[] args) throws IOException {
        // StringReader is a subclass of Reader.
        Reader reader = new StringReader("123456789-987654321-12345-12");

        // Create a temporary char array.
        char[] temp = new char[5];
        int charCount = -1;
        String s;

        while ((charCount = reader.read(temp)) != -1) {
            s=new String(temp, 0, charCount);
            System.out.println(s);
        }
        reader.close();
    }
}
