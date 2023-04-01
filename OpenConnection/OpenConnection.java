package OpenConnection;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class OpenConnection {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://www.youtube.com");
            URLConnection uc = url.openConnection();
            Map<String, List<String>> stream = uc.getHeaderFields();
            System.out.println(stream);

            // getContentType()
            String contentType = uc.getContentType();
            System.out.println("content type: " + contentType);

            // getContentLength()
            int length = uc.getContentLength();
            System.out.println("Length: " + length);

            // getDate()
            long date = uc.getDate();
            System.out.println("Date: " + date);

            // getLastModify()
            long lastModify = uc.getLastModified();
            System.out.println("Last modified: " + lastModify);

            // getExpiration();
            long expiry = uc.getExpiration();
            System.out.println("expiration: " + expiry);

            // getContentEncoding
            String contentEnc = uc.getContentEncoding();
            System.out.println("Content Encoding: " + contentEnc);

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
