package org.example.model;

public class LoopsPetla {
    //napisz metodę, która za pomocą petli
    // while wyświeltli wszystkie liczby z zakresu od 0 do n włącznie (n to argument)

    public static void printNumbers(int n) {
        int i = 0;
        while (i <= n) {
            System.out.println(i + " ");
            i++;
        }
        System.out.println();
    }
    //Napisz metodę, która za pomocą pętli while doda do siebie wszyskie liczby mniejsze niż liczba podana
    // w argumencie metody

    public static void addNumbers(int n) {
        int i = 0;
        int sum = 0;
        while (i < n) {
            sum += i++;

        }
        System.out.println(sum);;
    }
    //Napisz metodę, która w argumencie przyjmie liczbę typu int np 5 i zwróci sumę liczb
    // 5 + 4 + 3 + 2 + 1;

    public static void sumFiveNumbers( int n) {
        int sum = 0;
        while (n > 0) {
            sum += n--;
        }
        System.out.println(sum);

        //Napisz metodę, która zwróci booleana z odpowiedzią czy wszystkie liczby w danej tablicy
        // typu int podanej w argumencie są podzielne przez 2 i 3 jednocześnie;

        public static boolean allNumbersDivisibleByTwoAndThree(int[] numbers) {
            int i = 0;
            while(numbers[i] % 2 != 0 || numbers[i] % 3 != 0) {
                boolean e = i < numbers.length;
                i++;
                System.out.println(true);

            }
            System.out.println(false);
        }
    }
}
