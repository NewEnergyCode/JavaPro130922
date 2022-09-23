package HomeWork4;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sumBounds());

    }

    public static void printThreeWords() {
        System.out.println("1) printThreeWords:");
        System.out.println("""
                Orange
                Banana
                Apple""");

    }

    public static void checkSumSign() {
        System.out.println("2) checkSumSign:");
        int a = 4;
        int b = 8;

        if ((a + b) >= 0) {
            System.out.println("Sum is positive.");
        } else {
            System.out.println("Sum is negative.");
        }

    }

    public static void printColor() {
        System.out.println("3) printColor:");
        int value = 100;
        if (value <= 0) {
            System.out.println("Red.");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow.");
        } else if (value > 100) {
            System.out.println("Green.");
        }
    }

    public static void compareNumbers() {
        System.out.println("4) compareNumbers:");
        int a = 2;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static boolean sumBounds() {
        System.out.println("4) sumBounds:");

        System.out.print("Enter number #1:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.print("Enter number #2:");
        int number2 = scanner.nextInt();

        int sumNumber = number1 + number2;

        if (sumNumber >= 10 & sumNumber <= 20) {
            return true;
        } else {
            return false;
        }

    }

}
