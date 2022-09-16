public class Main {

    public static void main(String[] args) {

        var massege = MassegeBuilder.getHello();
        var massege2 = MassegeBuilder.getHelloFriend("Bob");

        System.out.println(massege);
        System.out.println(massege2);

    }
}
