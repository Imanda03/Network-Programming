package FileHandling;

// import java.io.File;
import java.io.FileWriter;
// import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("helloWorld.txt");
            fileWriter.write("Something is written in a file");
            System.out.println("Mission completed");
            fileWriter.close();

        } catch (Exception e) {
            System.out.println("Error during writing a file");
        }
    }
}
