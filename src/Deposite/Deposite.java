package Deposite;

import java.util.Scanner;


public class Deposite {

    public static void deposite1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");

        String firstName = scanner.nextLine();

        System.out.println("Enter second name: ");

        String secondName = scanner.nextLine();
        System.out.println(firstName + " " + secondName);

    }
}
