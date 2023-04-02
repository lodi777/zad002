package pl.kurs;

public class Variables {


    public static void main(String[] args) {

        int a; //deklaracja zmiennej
        a = 5; //inicjacja zmiennej

        double b = 3.14; //deklaracja + inicjacja

        int i, j = 10, k, l = -111, m, n; //tak nie róbmy bo niezgodne z zasadani clean code bo nieczytelne

        byte b1 = 5;
        short s1 = 282;
        long l1 = 2_000_000_000;
        float f1 = 1.24524F;
        char c1 = '@';
        String str = "kurwa";

        System.out.println(a);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(c1);
        System.out.println(str);

        String name = "kamil";
        System.out.println(name);
        char symbol = '$';
        System.out.println(symbol);
        byte bajt1 = 123;
        System.out.println(bajt1);
        short liczba = 1234;
        System.out.println(liczba);
        byte b2 = 1;
        short s2 = 259;
        int i2 = 2_100_000_000;
        long l2 = 2_900_900_900_900_900L;
        char c3 = 'G';
        float f2 = 1.2562F;
        double d2 = 1.2455321;
        String tool = "Młotek";
        int x = 2;
        int y = 4;
        System.out.println(x + y);
        System.out.println(l2 + " " + i2);
        System.out.println(i2 + l2);
        System.out.println(c3 + tool);
        char t = '\u260E';
        String s5 = "Dzwoni";
        String s6 = "twoja stara";
        String s7 = "Kuba";
        System.out.println(s5 + " " + t);
        System.out.println(s5 + " " + s7);
        System.out.println(s5 + " " + s6);


        //nazewnictwo zmiennych
        int redCarCounter = 0;  //lower camel case
        boolean czyToŚciema = false;
        System.out.println(redCarCounter);

        var var1 = "dupa";
        var var2 = 123;
        var var3 = 'a';
        var var = 123L;


        long worldPopulationNumber = 8_000_000_000L;

        System.out.println(worldPopulationNumber);

        worldPopulationNumber = 300_000_000;

        System.out.println(worldPopulationNumber);

        char ch1 = 'c';
        char ch2 = 99;
        char ch3 = 0x63; // 99 zapisane szesnastkow
        char ch4 = 00143; // 99 zapisane ósemkowo
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);

        System.out.println("-------------------------------------------");
        String firstName = "Ania";
        String lastName = "Kowalska";
        int age = 30;
        int carCounter = 3;
        String drivingLicenseCategory = "B";
        String idNumber = "CAZ1234";
        int additionalYears = 5;

        System.out.println(firstName + " " + lastName + " ma " + age + " lat");
        System.out.println(firstName + " " + lastName + " posiada " + carCounter + " samochody osobowe");
        System.out.println(firstName + " ma prawo jazdy kategorii " + drivingLicenseCategory);
        System.out.println(firstName + " " + lastName + " ma dowód osobisty o numerze " + idNumber);
        System.out.println("Za " + additionalYears + " lat " + firstName + " " + lastName + " będzie miała "
                + (age + additionalYears) + " lat");


    }
}
