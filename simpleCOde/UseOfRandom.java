package simpleCOde;

import java.util.Random;
import java.util.Scanner;

public class UseOfRandom {
    public static void main(String[] args) {
        // Scanner part
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        sc.close();

        Random ran = new Random();
        int guessNum1 = ran.nextInt(10);

        if (num1 == guessNum1) {
            System.out.println("You have guess the correct answeer");
        } else if (num2 == guessNum1) {
            System.out.println("Second number is correct");
        } else {
            System.out.println("Try again");
        }

        System.out.println("The Random number is " + guessNum1);
    }
}
