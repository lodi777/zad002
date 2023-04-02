package pl.kurs.model;

import java.io.Serializable;
public class Car implements Serializable { //klasa java beans
    private String producer;
    private String model;
    private String color;
    private int year;

     public Car() {
    }

     public Car(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
    }

    public Car(String producer, String model, String color, int year) {
        this(producer, model, color); // thisem mozna wywolywac inne konstruktory
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInfo(){
        return color + " " + producer + " " + model + " " + year;
    }

    public void printInfo(){
        System.out.println(getInfo());
    }

}
