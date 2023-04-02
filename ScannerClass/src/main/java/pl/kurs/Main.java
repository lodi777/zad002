package pl.kurs;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj swoje imię:");
        String name = scanner.nextLine(); //Mario + \n
        System.out.println("Podaj swoje zarobki:");
        double salary = scanner.nextDouble(); //12 + \n
        scanner.nextLine(); //oczyszcza bufor ze znaku nowej linii
        System.out.println("Masz na imię: " + name + ", Zarabiasz: " + salary);
        System.out.println("Podaj ulubiony kolor:");
        String color = scanner.nextLine();
        System.out.println("Ulubiony kolor to: " + color);
        scanner.close();


    }
}