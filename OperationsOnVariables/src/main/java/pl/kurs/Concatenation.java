package pl.kurs;

public class Concatenation {
    public static void main(String[] args) {
        String phase1 = "Doktor ";
        String phase2 = "Quinn";
        String phase3 = phase1 + phase2 + " to znany leakrz" + '!' + " " + '\u4567' + "\u6765" + true + false;
        System.out.println(phase3);


        String w1 = 5 + 5 + "QWERTY"; //10QWERTY
        String w2 = "QWERTY" + (5 + 5); // QWERTY55
        System.out.println(w1);
        System.out.println(w2);


        //to nie konkatenacja tylko działanie matematyczne
        System.out.println('k' + 'o' + 't');


        char letter1 = 'j'; //106
        char letter2 = 'a'; //97
        char letter3 = 'v'; //118
        System.out.println("Sumowanie znaków, które nie jest konkatenacją:");
        System.out.println(letter1 + letter2 + letter3 + letter2);   //sumuje inty z tablicy ASCII


        System.out.println("Aby wyświetlić napis \"java\" dodaj \"\" na początku!");
        System.out.println("" + letter1 + letter2 + letter3 + letter2);



    }
}
