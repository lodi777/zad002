import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed) {
            System.out.println("Podaj Liczbę");
            int userNumber = scanner.nextInt();

            if (userNumber < numberToGuess) {
                System.out.println("Liczba jest za mała");
            } else if (userNumber > numberToGuess) {
                System.out.println("Liczba jest za duża");
            } else {
                System.out.println("Brawo, liczba jest właściwa!");
                wasNumberGuessed = true;
            }






        }
        }

}