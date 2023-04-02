package pl.kurs.homework.service;

public class HomeworkService {
    public static void printNumbersRangeClosed(int n) {
        int x = 0;
        while (x <= n) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
    }

    public static int sumNumbers(int n) {
        int sum = 0;
        int x = 0;
        while (x < n) {
            sum += x++;
        }
        return sum;
    }

    public static int sumSetNumbers(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n--;
        }
        return sum;
    }

    public static boolean allNumbersDivisibleByTwoAndThree(int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 2 != 0 || numbers[x] % 3 != 0) {
                return false;
            }
        }
        return true;
    }

    public static double power(int a, int b) {
        double result = 1;
        for (int i = 0; i < Math.abs(b); i++ ) {
            result *= a;

        }
        return b < 0 ? 1 / result : result;
    }
    //Napisz metodę, która w argumencie przyjmie tablicę intów i zwróci nową tablicę wypłenioną tylko parzystymi
    // liczbami z tablicy wejściowej. Tablica wynikowa nie może posiadać żadnych zer i ma mieć taki rozmiar ile jest liczb parzystych.
    public static int[] getEvenNumbersArray(int[] inputArray) {
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0 && inputArray[i]  % 2 == 0) {
                count++;
            }
        }
        int[] resultArray = new int[count];

        int index = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0 && inputArray[i] % 2 == 0) {
                resultArray[index] = inputArray[i];
                index++;
            }
        }
        return resultArray;
    }

    //Napisz metodę, która zwróci booleana z odpowiedzią czy dana tablica intów przekazana w argumecie jest posortowana
    // (przykładowa sygnatura public boolean isSorted(int[] array)):
    public static boolean isSorted(int[] array) {
        boolean isSortedAscending = true;
        boolean isSortedDescending = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSortedAscending = false;
            }
            if (array[i] < array[i + 1]) {
                isSortedDescending = false;
            }
        }
        return isSortedAscending || isSortedDescending;
    }
}
