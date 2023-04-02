package org.example;

public class App {
    public static void narysujKlepsydre(int wys) {

        int srodek = wys / 2;

        for (int i = 0; i < wys; i++) {

            int spacje = Math.abs(srodek - i);


            int gwiazdki = wys / 2 - spacje ;


            for (int j = 0; j <= gwiazdki; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= 2 * spacje; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        narysujKlepsydre(15);
        System.out.println();
    }
}
