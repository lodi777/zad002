package pl.kurs.homework.zad1;

public class InternetShop {
    public static void main(String[] args) {
        Customer customerKris = new Customer();
        customerKris.premiumCustomer = false;
        customerKris.firstName = "Krzysztof";
        customerKris.secondName = "Zięba";

        Address addressKris = new Address();
        addressKris.street = "Zielona Mila";
        addressKris.city = "Wypizdow";
        addressKris.houseNumber = "5";

        Address shopAddress = new Address();
        shopAddress.city = "Warszawa";
        shopAddress.street = "Zielona";
        shopAddress.houseNumber = "10";

        Employee employeeAlbert = new Employee();
        employeeAlbert.contractType = "Umowa o prace na czas nieokreślony";
        employeeAlbert.firstName = "Albert";
        employeeAlbert.secondName = "Biernacki";
        employeeAlbert.seniorityYears = 10;
        employeeAlbert.salary = 2200;

        Delivery krisDelivery = new Delivery();
        krisDelivery.deliveryAddress = addressKris;
        krisDelivery.deliveryForm = "Kurier";
        krisDelivery.fragilePackage = true;
        krisDelivery.senderAddress = shopAddress;

        Order krisOrder = new Order();
        krisOrder.date = "18.01.2023";
        krisOrder.items = "Gopro Hero 5";
        krisOrder.customer = customerKris;
        krisOrder.packer = employeeAlbert;
        krisOrder.delivery = krisDelivery;



    }
}
