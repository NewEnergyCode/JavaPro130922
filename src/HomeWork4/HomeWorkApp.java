package HomeWork4;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sumBounds(scanIntNumb(), scanIntNumb()));

        naturalNumbers();
        System.out.println(naturalNumbers2());
        wordAndNumb();
        System.out.println(leapYear());

    }

    public static void printThreeWords() {
        System.out.println("2) printThreeWords:");
        System.out.println("""
                Orange
                Banana
                Apple""");

    }

    public static void checkSumSign() {
        System.out.println("3) checkSumSign:");
        int a = 4;
        int b = 8;

        if ((a + b) >= 0) {
            System.out.println("Sum is positive.");
        } else {
            System.out.println("Sum is negative.");
        }

    }

    public static void printColor() {
        System.out.println("4) printColor:");
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
        System.out.println("5) compareNumbers:");
        int a = 2;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static boolean sumBounds(int a, int b) {
        System.out.println("6) sumBounds:");

        int sumNumber = a + b;

        if (sumNumber >= 10 & sumNumber <= 20) {
            return true;
        } else {
            return false;
        }


    }

    public static void naturalNumbers() {
        System.out.println("7) naturalNumbers:");

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter int number:");

        int number = scanner2.nextInt();

        if (number >= 0) {
            System.out.println("Your number is positive.");
        } else {
            System.out.println("Your number is negative.");
        }

    }

    public static boolean naturalNumbers2() {
        System.out.println("8) naturalNumbers2:");

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter int number:");

        int number2 = scanner3.nextInt();

        if (number2 > 0) {
            return false;
        } else if (number2 < 0) {
            return true;
        } else if (number2 == 0) {
            System.out.println("You enter zero.");
            naturalNumbers2();
        }
        return false;
    }

    public static void wordAndNumb() {
        System.out.println("9) wordAndNumb:");

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter string:");

        String word = scanner4.nextLine();
        System.out.print("Enter number:");
        int number3 = scanner4.nextInt();

        for (int i = 0; i != number3; i++) {
            System.out.println(word);
        }
    }

    public static boolean leapYear() {
        System.out.println("10) leanYear:");
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Enter number:");
        int number6 = scanner5.nextInt();

        if (((number6 % 4 == 0) && (number6 % 100 != 0)) || (number6 % 400 == 0)) {
            return true;
        }else {
            return false;
        }

        }

    public static int scanIntNumb(){

        System.out.print("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        return number1;

    }

    }
