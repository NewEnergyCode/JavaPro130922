package Deposite;



public class Deposite {


    public static void procent() {

        double interestFor1year = App.contAmount * App.TAX;
        double depFor1year = App.contAmount + interestFor1year;
        double depFor5year = (App.contAmount + interestFor1year) * 5;
        double depFor10year = (App.contAmount + interestFor1year) * 10;

        System.out.println("---------------------------------------------" +
                "\nClient name: " + App.firstName + " " + App.secondName +
                "\nContribution amount: " + App.contAmount +
                "\nAmount per year: " + depFor1year +
                "\nAmount per 5 years: " + depFor5year +
                "\nAmount per 10 years: " + depFor10year);
    }
}
