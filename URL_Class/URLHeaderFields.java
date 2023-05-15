package URL_Class;

import java.net.*;

public class URLHeaderFields {
   public static void main(String[] args) {
      try {
         URL url = new URL("http://www.google.com"); // Change the URL as per your requirement
         URLConnection connection = url.openConnection();

         // Print all the header fields
         for (String header : connection.getHeaderFields().keySet()) {
            System.out.println(header + ": " + connection.getHeaderField(header));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
