package pl.kurs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] array1 = new int[10];
        int array11[] = new int[2]; //c style array declaration
        String[] array2 = new String[5];
        char[] array3 = new char[4];
        boolean[] array4 = new boolean[6];

        System.out.println(array1);
        System.out.println(Arrays.toString(array1));

        String[] carsBrandsNames = new String[4];
        carsBrandsNames[0] = "BMW";
        carsBrandsNames[1] = "Audi";
        carsBrandsNames[2] = "Mercedes";
        carsBrandsNames[3] = "Porsche";

        System.out.println(carsBrandsNames.length);

        System.out.println(Arrays.toString(carsBrandsNames));

        int[] numbers = new int[]{1, 4, 2, 6, 0};
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {1, 4, 2, 6, 0};
        System.out.println(Arrays.toString(numbers2));

        Employee employee1 = new Employee("Kazik", "Biedroń", 10000);
        Employee employee2 = new Employee("Janek", "Żbik", 20000);

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = employee1;
        employeeArray[1] = employee2;

        System.out.println(employeeArray[0].getSalary());
        System.out.println(employeeArray[2]);
        //System.out.println(employeeArray[5]); wyjątek spowodowany przekroczeniem zakresu tablicy




        //tablice wielowymiarowe
        int tab[][] = new int[3][3];

        //tab[0][0]     tab[0][1]      tab[0][2]
        //
        //tab[1][0]     tab[1][1]      tab[1][2]
        //
        //tab[2][0]     tab[2][1]      tab[2][2]

        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.deepToString(tab));


        String[] heroes = {"batman", "spiderman", "robocop"};
        String[] cities = {"New York", "Detroit", "Gotham"};
        String[][] heroesAndCities = {heroes, cities};


        System.out.println("nazwa: " + heroesAndCities[0][0]);
        System.out.println("miasto: " + heroesAndCities[1][2]);

        System.out.println("nazwa: " + heroesAndCities[0][1]);
        System.out.println("miasto: " + heroesAndCities[1][0]);

        System.out.println("nazwa: " + heroesAndCities[0][2]);
        System.out.println("miasto: " + heroesAndCities[1][1]);

        System.out.println(Arrays.deepToString(heroesAndCities));


    }
}