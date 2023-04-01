package Cookies;

import java.net.*;
import java.util.*;

public class HTTP_Example {
    public static void main(String[] args) {

        try {
            CookieManager manager = new CookieManager();
            CookieStore cookieStore = manager.getCookieStore();
            HttpCookie cookie = new HttpCookie("c1", "ANish");
            HttpCookie cookie2 = new HttpCookie("c2", "Imanda");

            URI uri1 = new URI("www.abc.com");
            URI uri2 = new URI("www.xyz.com");

            cookieStore.add(uri2, cookie2);
            cookieStore.add(uri1, cookie);

            List<HttpCookie> list = cookieStore.getCookies();
            System.out.println("Store Cookie: " + list);
        } catch (Exception e) {
            System.out.println("Error occured. Look carefully");
        }

    }
}
