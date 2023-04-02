package pl.kurs.zad;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //double a1;
        //double a2;


        Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj pierwszą liczbę");
            double number1 = scanner.nextDouble();
            System.out.println("Podaj drugą liczbę");
            double number2 = scanner.nextDouble();
            System.out.println("Wynik:" + calculator.addTwoNumbers(number1, number2));

            scanner.close();


    }
}
