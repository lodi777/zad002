package pl.kurs.homework.model;

public class Car {

    private String brand;
    private String model;
    private boolean roofIsOpen;
    private boolean carIsMoving;

    public Car(String brand, String model, boolean roofIsOpen, boolean carIsMoving) {
        this.brand = brand;
        this.model = model;
        this.roofIsOpen = roofIsOpen;
        this.carIsMoving = carIsMoving;

    }


    public void openRoof() {
        if (roofIsOpen) {
            System.out.println("Dach już jest otwarty.");
        } else if (carIsMoving) {
            System.out.println("Niemożna otworzyć dachu podczas jazdy, zatrzymaj się aby otworzyć dach.");
        } else {
            roofIsOpen = true;
            System.out.println("Dach został otwarty.");
        }
    }

    public void closeRoof() {

        if (!roofIsOpen) {
            System.out.println("Dach jest zamknięty.");
        } else if (carIsMoving) {
            System.out.println("Niemożna zamknąć dachu podczas jazdy.");
        } else {
            roofIsOpen = false;
            System.out.println("Dach został zamknięty.");
        }


    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", roofIsOpen=" + roofIsOpen +
                ", carIsMoving=" + carIsMoving +
                '}';
    }
}