package pl.kurs.homework.app;

import pl.kurs.homework.model.Car;

public class CarRoofApp {
    public static void main(String[] args) {
        Car car = new Car("Audi", "S3", false, true);


        //car.openRoof();
        car.closeRoof();
    }
}
