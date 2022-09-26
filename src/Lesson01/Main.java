package Lesson01;

public class Main {

    public static void main(String[] args) {

        var massege = MassegeBuilder.getHello();
        var friendGrit = MassegeBuilder.getHelloFriend("Bob");

        System.out.println(massege);
        System.out.println(friendGrit);

    }
}
