package pl.kurs.app;

import pl.kurs.service.CarFactory;
import pl.kurs.service.CarPainter;
import pl.kurs.model.Car;

public class Main {

    public static void main(String[] args) {




        Car alfaRomeo = new Car();
        alfaRomeo.setProducer("Alfa Romeo");
        alfaRomeo.setProducer("Giulia");
        alfaRomeo.setColor("Red");

        String carInfo = alfaRomeo.getInfo();
        System.out.println(carInfo); //Red Alfa Romeo Giulia

        alfaRomeo.printInfo();

        Car audi = new Car();
        audi.setProducer("Audi");
        audi.setModel("E-tron GT");
        audi.setColor("Silver");


        audi.printInfo();

        CarPainter carPainter = new CarPainter();
        carPainter.changeCarColor("Red", audi);
        audi.printInfo();

        CarFactory carFactory = new CarFactory();

        Car furaDlaMojejStarej = carFactory.createBranNewCar("Mini", "Cooper", "Czerwony");

        furaDlaMojejStarej.printInfo();

        Car merc = new Car("MB", "C63S", "White");

        merc.printInfo();

        Car lada = new Car("Łada", "Niva", "Szary", 1967);

        lada.printInfo();

        lada.setYear(2000);
        System.out.println(lada.getYear());





    }





}