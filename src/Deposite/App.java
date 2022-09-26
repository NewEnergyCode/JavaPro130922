package Deposite;


import java.util.Scanner;

public class App {
    static double contAmount;
    static String firstName;
    static String secondName;

    static double TAX = 0.1;

    public static void main(String[] args) {

        customerData();
        Deposite.procent();
    }

    public static void customerData() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");

        firstName = scanner.nextLine();

        System.out.print("Enter second name: ");

        secondName = scanner.nextLine();


        System.out.print("Enter your contribution amount: ");

        contAmount = scanner.nextDouble();

    }
}
