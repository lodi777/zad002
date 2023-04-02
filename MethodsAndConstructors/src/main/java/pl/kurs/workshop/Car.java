package pl.kurs.workshop;

public class Car {
    String producer;
    String model;
    int powerHp;
    int torqueNm;
    String color;

    Car(String producer, String model, int powerHp, int torqueNm, String color) {
        this.producer = producer;
        this.model = model;
        this.powerHp = powerHp;
        this.torqueNm = torqueNm;
        this.color = color;
    }
}
