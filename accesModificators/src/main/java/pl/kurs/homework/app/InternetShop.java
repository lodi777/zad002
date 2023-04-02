package pl.kurs.homework.app;

import pl.kurs.homework.model.*;

public class InternetShop {
    public static void main(String[] args) {
        Customer customerKris = new Customer();
        customerKris.setPremiumCustomer(false);
        customerKris.setFirstName("Krzysztof");
        customerKris.setSecondName("Zięba");

        Address addressKris = new Address();
        addressKris.setStreet("Zielona Mila");
        addressKris.setCity("Wypizdów");
        addressKris.setHouseNumber("5");

        Address shopAddress = new Address();
        shopAddress.setCity("Warszawa");
        shopAddress.setStreet("Zielona");
        shopAddress.setHouseNumber("14");

        Employee employeeAlbert = new Employee();
        employeeAlbert.setContractType("Umowa o prace na czas nieokreślony");
        employeeAlbert.setFirstName("Albert");
        employeeAlbert.setSecondName("Fiut");
        employeeAlbert.setSeniorityYears(23);
        employeeAlbert.setSalary(2200);

        Delivery krisDelivery = new Delivery();
        krisDelivery.setDeliveryAddress(addressKris);
        krisDelivery.setDeliveryForm("Kurier");
        krisDelivery.setFragilePackage(true);
        krisDelivery.setSenderAddress(shopAddress);

        Order krisOrder = new Order();
        krisOrder.setDate("10.02.2005");
        krisOrder.setItems("GoPro Hero 5");
        krisOrder.setCustomer(customerKris);
        krisOrder.setPacker(employeeAlbert);
        krisOrder.setDelivery(krisDelivery);



    }
}
