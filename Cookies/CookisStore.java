import java.io.*;

public class CookisStore {
    private static final String COOKIE_FILE = "cookies.txt";
    
    public static void storeCookies(String[] cookies) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(COOKIE_FILE))) {
            for (String cookie : cookies) {
                writer.println(cookie);
            }
        } catch (IOException e) {
            System.err.println("Error storing cookies: " + e.getMessage());
        }
    }
    
    public static String[] readCookies() {
        try (BufferedReader reader = new BufferedReader(new FileReader(COOKIE_FILE))) {
            String line;
            int i = 0;
            String[] cookies = new String[10];
            while ((line = reader.readLine()) != null) {
                cookies[i++] = line;
            }
            return cookies;
        } catch (IOException e) {
            System.err.println("Error reading cookies: " + e.getMessage());
            return null;
        }
    }
    
    public static void main(String[] args) {
        try {
            String[] cookies = {"cookie1=value1", "cookie2=value2", "cookie3=value3"};
            storeCookies(cookies);
            
            String[] readCookies = readCookies();
            System.out.println("Read cookies:");
            for (String cookie : readCookies) {
                if (cookie != null) {
                    System.out.println(cookie);
                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
