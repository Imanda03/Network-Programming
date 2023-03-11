package Package;

public class Package {
    public static void main(String[] args) {
        System.out.println("I am main class");
    }

}

/*
 * A package is used to group related classes.
 * Packaged helps to avoid name conflict.
 * two types of packages :-
 * 1. Build-in packages
 * 2. User defined packages
 * 
 * 
 * three ways to used packages
 * 1. Add a particular packaged like java.util.Scanner;
 * 2. Add all pachage of java and use particular package like
 * java.util.*;
 * Scanner sc = new Scanner(System.in);
 * 
 * 3. Add whare you want to use like
 * java.util.Scanner sc = new java.util.Scanner();
 */

// Code - javac -d . *.java