package HomeWork4;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();

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


}
