package URL_Class;
import java.net.*;
import java.io.*;

public class TestUrlWrite {
   public static void main(String[] args) {
      try {
         URL url = new URL("http://www.google.com"); // Change the URL as per your requirement
         BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

         // Define the file to save the content into
         File file = new File("URLTest.html");

         // Create the file if it does not exist
         if (!file.exists()) {
            file.createNewFile();
         }

         // Open a file writer with append mode
         FileWriter writer = new FileWriter(file, true);

         // Read the content from the URL and save it into the file
         String inputLine;
         while ((inputLine = in.readLine()) != null) {
            writer.write(inputLine);
         }

         // Close the streams
         in.close();
         writer.close();

         System.out.println("Content saved successfully.");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
