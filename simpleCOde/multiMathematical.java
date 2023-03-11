package simpleCOde;

import java.util.Scanner;

class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        sc.close();

        int sum = a + b;
        System.out.println("The sum is" + sum);
    }
}
