package HomeWork5;

public class Reverse {
    public static void main(String[] args) {
        String sentence = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";

        System.out.println("Old String: " + sentence);

        String[] array = new StringBuilder(sentence).reverse().toString().split("Z");
        StringBuilder newString = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--)
            newString.append(array[i]).append(" ");
        System.out.println("New String: " + newString);

    }
}
