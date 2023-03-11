package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadingFile2 {
    public static void main(String[] args) {
        try {
            File myFile = new File("helloWorld.txt");
            FileReader readFile = new FileReader(myFile);
            BufferedReader bufFile = new BufferedReader(readFile);
            String text = bufFile.readLine();
            System.out.println(text);
            bufFile.close();
        } catch (Exception e) {
            System.out.println("Error during reading file");
        }
    }
}
