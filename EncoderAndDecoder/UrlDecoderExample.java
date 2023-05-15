package EncoderAndDecoder;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class UrlDecoderExample {
    public static String decodeUrl(String givenUrl) {
        String decodeUrl = givenUrl;
        try {
            decodeUrl = URLDecoder.decode(givenUrl, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return decodeUrl;
    }

    public static String encodeUrl(String givenUrl) {
        String encodedUrl = givenUrl;
        try {
            encodedUrl = URLEncoder.encode(givenUrl, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return encodedUrl;
    }

    public static void main(String[] args) {
        String url = "https://www.javaguides.net/search?q=core+java+tutorial#abcdef";
        String url2 = "https%3A%2F%2Fwww.javaguides.net%2Fsearch%3Fq%3Dcore%2Bjava%2Btutorial";
        try {
            URI uriBase = new URI(url);
            URI uri = uriBase.create(url);
            String query = uri.getQuery();
            String fragments = uri.getFragment();

            System.out.println(" Encoded");
            System.out.println(encodeUrl(url));
            System.out.println("Decoded");
            System.out.println(decodeUrl(url2));

            System.out.println("GetQuery");
            System.out.println(query);
            System.out.println("Fragment");
            System.out.println(fragments);
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
