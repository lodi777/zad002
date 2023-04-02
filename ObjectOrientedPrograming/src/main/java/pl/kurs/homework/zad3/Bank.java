package pl.kurs.homework.zad3;

public class Bank {
    public static void main(String[] args) {
        Address zadupie = new Address();
        zadupie.addressLine1 = "Złota 6";
        zadupie.postalCode = "00-019";
        zadupie.city = "Warsaw";

        Person client1 = new Person();

        client1.firstName = "Adam";
        client1.secondName = "Glapiński";
        client1.pesel = "701031099";
        client1.postalAddress = zadupie;
        client1.registeredAddress = zadupie;

        Account direct = new Account();

        direct.balance = 1000000L;
        direct.owner = client1;

        Credit kredyt = new Credit();

        kredyt.borrower = client1;
        kredyt.creditTimeInMonths = 24;
        kredyt.interestRate = 1.15;
        kredyt.lendAmount = 2000000L;
        kredyt.returnedAmount = 1000000L;




    }
}
