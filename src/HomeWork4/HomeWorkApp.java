package HomeWork4;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();

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


}
