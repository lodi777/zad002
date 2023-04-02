package pl.kurs;

public class Homework {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 8;
        int multiplication = firstNumber * secondNumber;


        System.out.println(!(firstNumber > secondNumber));
        System.out.println(firstNumber <= secondNumber);
        System.out.println();
        System.out.println(firstNumber * 3 > secondNumber);
        System.out.println();
        System.out.println(firstNumber + 2 > secondNumber && firstNumber - 5 < secondNumber);
        System.out.println();
        System.out.println(multiplication % 2 != 0);


    }
}
