package URL_Class;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class BufferReader {
    public static void main(String[] args) {

        try {
            File file = new File("helloWorld.txt");

            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
