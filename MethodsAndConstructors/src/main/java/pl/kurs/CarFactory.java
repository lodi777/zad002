package pl.kurs;

public class CarFactory {
   Car createBranNewCar(String producer, String model, String color){
       Car orderedCar = new Car();
       orderedCar.producer = producer;
       orderedCar.model = model;
       orderedCar.color = color;

       return orderedCar;
   }
}
