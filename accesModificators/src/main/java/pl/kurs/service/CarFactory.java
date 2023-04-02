package pl.kurs.service;

import pl.kurs.model.Car;

public class CarFactory {
   public Car createBranNewCar(String producer, String model, String color){
       Car orderedCar = new Car();
       orderedCar.setProducer(producer);
       orderedCar.setColor(color);
       orderedCar.setModel(model);

       return orderedCar;
   }
}
