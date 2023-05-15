package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class CreateFIle {
    public static void main(String[] args) {
        File myFile = new File("helloWorld.txt");
        try {

            FileWriter fw = new FileWriter(myFile);
            fw.write("Hello NIST");
            fw.close();
            System.out.println("File mission has been completed!!");
        } catch (IOException e) {
            System.out.println("Error during creating the files!!");
        }

        try {

            FileReader fr = new FileReader(myFile);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println(line);
            br.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }
}

/*
 * File handling in Java implies reading from and writing data to a file. The
 * File class from the java.io package, allows us to work with different formats
 * of files. In order to use the File class, you need to create an object of the
 * class and specify the filename or directory name.
 */