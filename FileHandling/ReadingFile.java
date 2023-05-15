package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        File mFile = new File("helloWorld.txt");
        try {
            Scanner sc = new Scanner(mFile);
            while (sc.hasNextLine()) {
                String text = sc.nextLine();
                System.out.println(text);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Error during reading a file");
        }
    }
}
