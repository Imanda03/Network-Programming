package FileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("helloWorld.txt");
        if (myFile.delete()) {
            System.out.println(myFile.getName() + " has been deleted");
        } else {
            System.out.println("Sorry I cannot delete it");
        }
    }
}
