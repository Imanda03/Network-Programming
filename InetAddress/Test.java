package InetAddress;

import java.net.*;

public class Test {
    public static void main(String[] args) {

        // To get and print InetAddress of local Host
        try {
            InetAddress ad1 = InetAddress.getLocalHost();
            System.out.println(ad1);

        } catch (Exception e) {
            System.out.println(e);
        }

        // To get and print InetAddress of Named Host
        try {

            InetAddress ad2 = InetAddress.getByName("www.javapoint.com");
            byte addr[] = { 72, 3, 2, 12 };
            System.out.println("ip : " + ad2);
            InetAddress ip2 = InetAddress.getByAddress(addr);
            System.out.print("\nip2 : " + ip2);
            // System.out.print("\nAddress : " + Arrays.toString(ad2.getAddress()));
            System.out.print("\nHost Address : " + ad2.getHostAddress());
            System.out.print("\nisAnyLocalAddress : " + ad2.isAnyLocalAddress());
            System.out.print("\nisLinkLocalAddress : " + ad2.isLinkLocalAddress());
            System.out.print("\nisLoopbackAddress : " + ad2.isLoopbackAddress());
            System.out.print("\nisMCGlobal : " + ad2.isMCGlobal());
            System.out.print("\nisMCLinkLocal : " + ad2.isMCLinkLocal());
            System.out.print("\nisMCNodeLocal : " + ad2.isMCNodeLocal());
            System.out.print("\nisMCOrgLocal : " + ad2.isMCOrgLocal());
            System.out.print("\nisMCSiteLocal : " + ad2.isMCSiteLocal());
            System.out.print("\nisMulticastAddress : " + ad2.isMulticastAddress());
            System.out.print("\nisSiteLocalAddress : " + ad2.isSiteLocalAddress());
            System.out.print("\nhashCode : " + ad2.hashCode());
            System.out.print("\n Is ip1 == ip2 : " + ad2.equals(ip2));
            // InetAddress ad2 = InetAddress.getByAddress("www.javapoint.com", null);
            // System.out.println(ad2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
