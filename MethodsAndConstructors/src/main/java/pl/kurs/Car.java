package pl.kurs;

public class Car {
    String producer;
    String model;
    String color;
    int year;

     Car() {
    }

     Car(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
    }

    Car(String producer, String model, String color, int year) {
        this(producer, model, color); // thisem mozna wywolywac inne konstruktory
        this.year = year;
    }

    String getInfo(){
        return color + " " + producer + " " + model + " " + year;
    }

    void printInfo(){
        System.out.println(getInfo());
    }
}
