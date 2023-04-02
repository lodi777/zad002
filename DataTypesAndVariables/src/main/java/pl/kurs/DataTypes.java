package pl.kurs;

public class DataTypes {
    public static void main(String[] args) {

        //typy prymitywne (proste) całkowitliczbowe

        //byte - 1 bajt - zakres od -128 do 127 , 256 liczb
        //short - 2 bajty - zakres od -32 768 do 32 767 ,256^2
        //int - 4 bajty - zakres od -2 147 483 648 do 2 147 483 647 , 256^4 , typ domyślny
        //long - 8 bajtów - zakres od -2^63 do (2^63)-1 (posiadają przyrostek L, lub l, trzeba dodawać bo bez przyrostka do longa przypiszemy tak naprawdę inta)

        System.out.println(120); //to jest int
        System.out.println(2_000_000_000);
        System.out.println(1_000);
        System.out.println(3_000_000_000L);
        System.out.println(9_223_372_036_854_775_807L);


        //typy primtywne (proste) zmiennoprzecinkowe
        //float - 4 bajty - max ok 6-7 cyfr po przecinku (posiadają przyrostek F, lub f, który jest obligatoryjny)
        //double - 8 bajtów - max ok 15-16 cyfr po przecinku (posiadają przyrostek D, lub d ale nie trzeba dodawać), typ domyslny
        System.out.println(1.12345678901234567890F);
        System.out.println(1.12345678901234567890);

        System.out.println(111111111.12345678901234567890); //1.1111111112345679 * E8 (10^8)
        System.out.println(0.0003);  //3.0 * 10^-4

        System.out.println(2.0 - 1.5);
        System.out.println(2.0 - 1.2);
        System.out.println(2.0 - 1.1); //roundof error


        //typ prymitywny (prosty) znakowy char (2 bajty / 16 bit)- reprezentuje pojedynczy znak w apostrofach (literał znakowy) np 'a'
        System.out.println('1');
        System.out.println('a');
        System.out.println('A');
        System.out.println('%');
        System.out.println('.');
        System.out.println(' ');

        System.out.println('ą');
        System.out.println('\u0105'); //współrzędna kodowa jednostki znakowej tabeli UNICODE
        System.out.println('\u6757');
        System.out.println('\u2602');
        System.out.println('\u2603');

        //znaki specjalne:
        //•	\t - tab
        //•	\n - nowa linia
        //•	\r - powrót karetki
        //•	\" - cudzysłów
        //•	\' - apostrof
        //•	\\ - backslash

        System.out.println("    Ala ma kota");
        System.out.println();
        System.out.println('\t' + "Ala ma kota" + '\n');
        System.out.println("\tAla ma kota\n");
        System.out.println("\"Ala ma kota\"");
        System.out.println("\'Ala ma kota\'");
        System.out.println("Ala ma\\ kota");

        //typ prymitywny logiczny boolean (1 bit): true, false
        System.out.println(true);
        System.out.println(false);



        //Typ obiektowy String, reprezentowany przez literał stringowy (w czudzysłowie) np "Ala ma kota"
        System.out.println("Ala ma kota");
        System.out.println("Ala");
        System.out.println("A");
        System.out.println(" ");
        System.out.println(""); //pusty string czyli taki nie posiadający ani jednego znaku


    }
}
