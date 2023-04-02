package pl.kurs.workshop;

public class Person {
    String firstName;
    String secondName;
    double salary;
    Car ownedCar;

    public Person(String firstName, String secondName, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }
    void buyCar(Car carForBuy){
        ownedCar = carForBuy;
    }
    void sellCar(){
        ownedCar = null;

    }
}
