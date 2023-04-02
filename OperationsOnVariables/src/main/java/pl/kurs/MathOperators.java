package pl.kurs;

public class MathOperators {

    public static void main(String[] args) {



        //  + (dodawanie),
        //  - (odejmowanie),
        //  * (mnożenie),
        //  / (dzielenie),
        //  % (modulo / reszta z dzielenia) – używana najczęściej w celu sprawdzenia czy liczba jest parzysta czy nieparzysta.
        // Math.pow(2, 3);

//        System.out.println(Math.pow(2, 3));

        int x = 10;
        double y = 4;
        double sum = x + y; // dodawanie
        double subtract = x - y; // odejmowanie
        double multiplication = x * y; // mnożenie
        double division = x / y; // dzielenie
        double modulo = x % y; // modulo

        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulo);


        //operatory skrócone
        int a = 5;
        //a = a + 20;
        a += 20;
        System.out.println(a);


        int b = 12;
        //b = b - 9;
        b -= 9;
        System.out.println(b);

        int c = 38;
        //c = c * 3;
        c *= 3;
        System.out.println(c);

        double d = 125;
        //d = d / 3;
        d /= 3;
        System.out.println(d);

        int e = 10;
        //e = e % 4;
        e %= 4;
        System.out.println(e);

    }
}
