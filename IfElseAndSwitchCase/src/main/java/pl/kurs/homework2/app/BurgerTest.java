package pl.kurs.homework2.app;

import pl.kurs.homework2.model.Burger;
import pl.kurs.homework2.service.BurgerFactory;

public class BurgerTest {
    public static void main(String[] args) {


        BurgerFactory burgerFactory = new BurgerFactory();

        String burgerName = "Cheese Burger";


       Burger burger = switch (burgerName) {
           case "Cheese Burger" -> burgerFactory.createBurger(burgerName);
           case "Ogniste Uderzenie" -> burgerFactory.createBurger(burgerName);
           case "Polak Burger" -> burgerFactory.createBurger(burgerName);
           default -> null;
       };

        if (burger != null) {
            System.out.println("Składniki burgera " + burger.getName() + ":");
            System.out.println("Ser: " + burger.isCheese());
            System.out.println("Cebula: " + burger.isOnion());
            System.out.println("Jalapeno: " + burger.isJalapeno());
        }
    }
}
