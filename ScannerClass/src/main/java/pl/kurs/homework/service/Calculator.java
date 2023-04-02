package pl.kurs.homework.service;

import java.util.Scanner;

public class Calculator {
        public static double calculate(double number1, String operator, double number2) {


            switch (operator) {
                case "+":
                    return number1 + number2;
                case "-":
                    return number1 - number2;
                case "*":
                    return number1 * number2;
                case "/":
                    return number1 / number2;
                case "%":
                    return number1 % number2;
                case "potęgowanie":
                    return Math.pow(number1, number2);
                default:
                    return Double.NaN;
            }
        }
}

