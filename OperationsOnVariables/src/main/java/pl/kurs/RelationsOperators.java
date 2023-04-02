package pl.kurs;

public class RelationsOperators {
    public static void main(String[] args) {


        //== (równość wartości, np. "5 == 5"),
        //!= (nierówność wartości, np. "czy pięć jest różne od siedmiu" zapiszemy "5 != 7"),
        //>, >= (większy, bądź większy równy, np. "8 > 4"),
        //<, <= (mniejszy bądź mniejszy równy, np. "2 < 4",
        //instanceof (dotyczy typów obiektowych, np. String. Nie może być użyte w kontekście typów prostych. Przykład "Napis" instanceof String).

        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(3 > 2);
        System.out.println(3 < 2);
        System.out.println(3 >= 2);


        int x = 0;
        int y = 20;

        System.out.println("Czy x jest równe y?");
        System.out.println(x == y);  //false
        System.out.println();
        System.out.println("Czy x jest większe od y?");
        System.out.println(x > y); //false
        System.out.println();
        System.out.println("Czy x jest mniejsze od y?");
        System.out.println(x < y); //true
        System.out.println();
        System.out.println("Czy x nie jest równe  y?");
        System.out.println(x != y); //false
        System.out.println();
        System.out.println("Czy x jest liczbą parzystą?");
        System.out.println(x != 0 && x % 2 == 0); //false

    }
}
