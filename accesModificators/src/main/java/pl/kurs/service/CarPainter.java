package pl.kurs.service;

import pl.kurs.model.Car;

public class CarPainter {
    public void changeCarColor(String newColor, Car carForColorChange){
        carForColorChange.setColor(newColor);
    }
}
