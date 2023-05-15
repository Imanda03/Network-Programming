package simpleCOde;

import java.util.Scanner;

public class EvenOrOdd {
    public void check(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even number.");
        } else {
            System.out.println(num + " is Odd number");
        }
    }
}

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        EvenOrOdd ev = new EvenOrOdd();
        ev.check(num);
        sc.close();
    }
}
