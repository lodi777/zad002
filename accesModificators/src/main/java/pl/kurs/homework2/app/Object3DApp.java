package pl.kurs.homework2.app;

import pl.kurs.homework2.model.Object3D;
import pl.kurs.homework2.service.ObjectController;

public class Object3DApp {
    public static void main(String[] args) {
        Object3D obiekt = new Object3D(5, 2, 3);
        ObjectController objectController = new ObjectController(obiekt);

        obiekt.printInfo();
        objectController.increaseA();
        obiekt.printInfo();
        objectController.decreaseA();
        objectController.decreaseA();
        objectController.decreaseA();
        obiekt.printInfo();
        objectController.resetAll();
        obiekt.printInfo();
        objectController.decreaseB();
        objectController.decreaseB();
        objectController.decreaseB();
        objectController.decreaseB();
        obiekt.printInfo();
        objectController.resetToDefault();
        obiekt.printInfo();
        objectController.resetToDefault();



    }
}
