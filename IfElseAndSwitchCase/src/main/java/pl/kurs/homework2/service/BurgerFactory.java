package pl.kurs.homework2.service;

import pl.kurs.homework2.model.Burger;

public class BurgerFactory {
    public Burger createBurger(String burgerName) {

        if (burgerName.equals("Ogniste Uderzenie")) {
            return new Burger(burgerName, false, true, true);
        } else if (burgerName.equals("Cheese Burger")) {
           return new Burger(burgerName, true, false, false);
        } else if (burgerName.equals("Polak Burger")) {
            return new Burger(burgerName, true, true, false);
        } else {
            return null;
        }
    }
}
