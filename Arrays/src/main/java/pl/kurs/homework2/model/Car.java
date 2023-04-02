package pl.kurs.homework2.model;

public class Car { //producent, model, kolor i rok produkcji;
    String producer;
    String model;
    String color;
    int yearOfProduce;

    public Car(String producer, String model, String color, int yearOfProduce) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.yearOfProduce = yearOfProduce;
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

    public int getYearOfProduce() {
        return yearOfProduce;
    }

    public void setYearOfProduce(int yearOfProduce) {
        this.yearOfProduce = yearOfProduce;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduce=" + yearOfProduce +
                '}';
    }
}
