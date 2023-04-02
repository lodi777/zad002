package pl.kurs;

import java.util.Scanner;

public class Main {
    public static int arrayMethod(int[] array, String instruction) {

        if (instruction.equals("MAX")) {
            int max = 0;
            for (int number : array) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        } else if (instruction.equals("MIN")) {
            int min = array.length;
            for (int number : array) {
                if (number < min) {
                    min = number;
                }

            }
            return min;

        } else if (instruction.equals("SUM")) {
            int sum = 0;
            for (int number : array) {
                sum += number;
            }
            return sum;

        } else {
            return Integer.parseInt(null);
        }

    }

    public static void main(String[] args) {
        int[] array = {12, 2, 83, 4, 8, 6, 7, 5};
        int max = arrayMethod(array, "MAX");
        System.out.println("Największa liczba tablicy to: " + max);

        int min = arrayMethod(array, "MIN");
        System.out.println("Najmniejsza liczba tablicy to: " + min);

        int sum = arrayMethod(array, "SUM");
        System.out.println("Suma elementów tablicy to: " + sum);
    }

}