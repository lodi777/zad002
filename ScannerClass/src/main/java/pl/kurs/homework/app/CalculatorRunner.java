package pl.kurs.homework.app;

import pl.kurs.homework.service.Calculator;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        double number1 = scanner.nextDouble();

        System.out.print("Podaj operator (+, -, *, /, %, potęgowanie): ");
        String operator = scanner.next();

        System.out.print("Podaj drugą liczbę: ");
        double number2 = scanner.nextDouble();


        double result = Calculator.calculate(number1, operator, number2);
        System.out.println("Wynik: " + result);

        scanner.close();


    }
}
