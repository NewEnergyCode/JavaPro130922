package HomeWork5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculatorApp();
    }

    public static void calculatorApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                This is calculator.
                If you want to add, press 1.
                If you want to subtract, press 2.
                If you want to division, press 3.
                If you want to multiply, press 4.
                If you want to exit, press 5.""");
        int startNumber = scanner.nextInt();
        switch (startNumber) {
            case 1 -> {
                add(scanFirst(), scanSecond());
            }
            case 2 -> {
                sub(scanFirst(), scanSecond());
            }
            case 3 -> {
                div(scanFirst(), scanSecond());
            }
            case 4 -> {
                mult(scanFirst(), scanSecond());
            }
            case 5 -> {
                break;
            }
            default -> {
                System.out.println("No such operation");
                calculatorApp();
            }
        }


    }

    public static double scanFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fist number:");
        double number = scanner.nextDouble();
        return number;
    }

    public static double scanSecond() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter second number:");
        double number = scanner.nextDouble();
        return number;
    }

    public static void add(double a, double b) {

        double add = a + b;
        System.out.println("You result: " + add +
                "\n______________________");
        calculatorApp();
    }

    public static void sub(double a, double b) {
        double sub = a - b;
        System.out.println("You result: " + sub +
                "\n______________________");
        calculatorApp();
    }

    public static void div(double a, double b) {
        double div = a / b;
        System.out.println("You result: " + div +
                "\n______________________");
        calculatorApp();
    }

    public static void mult(double a, double b) {
        double mult = a * b;
        System.out.println("You result: " + mult +
                "\n______________________");
        calculatorApp();
    }
}
