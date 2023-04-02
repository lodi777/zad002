package pl.kurs;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //pętla while uzywamy jej wtedy kiedy nie wiemy ile razy ma sie petla wykonac(w teorii, bo w praktyce mozna dodac zewnetrznego countera)
//        boolean statement = 3 > 2;
//
//        while (statement) {
//            System.out.println("pętla while");
//        }
//        System.out.println("coś");


        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }

        System.out.println("----------------------------");


        int counter1 = 10;
        while (counter1 > 0) {
            System.out.println(counter1);
            counter1--;
        }
        int[] array = new int[6]; //[3, 4, 5, 6, 7, 8]

        int counter2 = 0;
        while (counter2 < array.length) {
            array[counter2] = counter2 + 3;
            counter2++;

        }
        System.out.println(Arrays.toString(array));

        //pętla do while uzywamy jej wtedy kiedy chcemy zeby kod przynajmniej raz sie odpalil.
        do {
            System.out.println("Jebac biede");
        } while (false);

//        Scanner scanner = new Scanner(System.in);
//        double salary = 54_000;
//        double savings = 0;
//
//        do {
//            savings += salary;
//            System.out.println("Stan konta: " + savings);
//            System.out.println("Czy wypłacic oszczędności? (N+enter dla nie / enter dla tak):");
//        } while (scanner.nextLine().equalsIgnoreCase("n"));
//        System.out.println("Wypłaciłeś: " + savings + " PLN, nie rozpierdol kurwiu xd");
//
//        scanner.close();


        //petle for
        for (int i = 0; i < 10; i++) {
            System.out.println("iteracja:" + i);
        }


        for (int i = 10; i > 0; i--) {
            System.out.println("iteracja: " + i);
        }


        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ile przepracowałeś miesięcy?");
//        int workingMonthsNumber = scanner.nextInt();
//        double totalIncome = 0;
//        for (int i = 0; i < workingMonthsNumber; i++) {
//            System.out.println("Ile zarobiłeś za " + (i + 1) + " miesiąc pracy");
//            totalIncome = totalIncome + scanner.nextDouble();
//
//        }
//        System.out.println("Łącznie zarobiles: " + totalIncome);
//        scanner.close();


        //pętla for each
        String[] superheroes = {"Batman", "Robin", "Batwing", "Catwoman"};
//        for (int i = 0; i < superheroes.length; i++) {
//            superheroes[i] = "Joker";
//
//        }


        for (String superhero : superheroes) {
            superhero = "Joker"; //niestety petla for each nie sluzy do modyfikacji tablic

        }
        System.out.println(Arrays.toString(superheroes));


        //Zagnieżdżanie pętli
        for (int i = 0; i < 4; i++) {
            System.out.println("Iteracja i = " + i);
            for (int k = 0; k < 4; k++) {
                System.out.println("Iteracja k = " + k);
            }
        }


        //break, continue – zmieniają przepływ sterowania w pętlach
        //break – przerywa działanie aktualnej iteracji i wychodzi z pętli;
        //continue – przerywa działanie aktualnej iteracji i przechodzi do kolejnej;


        for (int i = 0; i < 10; i++) {
            if (i != 0 && i % 2 == 0) continue;
            System.out.println("Pierwsza pętla: " + i);
        }

        System.out.println("--------------------------------------------");

        for (int i = 0; i < 10; i++) {
            if (i == 4) break;
            System.out.println("Druga pętla " + i);
        }


        //Etykiety do pętli
        outer_loop:
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteracja i = " + i);
            inner_loop:
            for (int j = 0; j < 5 ; j++) {
                if(j == 3) break outer_loop;
                System.out.println("Iteracja j = " + j);
            }
        }//krzygol2015@gmail.com

    }
}