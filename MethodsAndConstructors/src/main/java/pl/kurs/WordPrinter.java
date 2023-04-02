package pl.kurs;

public class WordPrinter {
    void printWords(String s1){ //sygnatura metody to jej nazwa + przyjmowane argumenty
        System.out.println(s1);
    }
    void printWords(String s1, String s2){  //metoda
        System.out.println(s1 + " " + s2);
    }
    void printWords(String s1, String s2, String s3){
        System.out.println(s1 + " " + s2 + " " + s3);
    }

    public static void main(String[] args) {
        WordPrinter wordPrinter = new WordPrinter(); //obiekt klasy wordPrinter

        wordPrinter.printWords("dupa");


        //Istnienie (w jednej klasie) wielu metod o tej samej nazwie ale roznych sygnaturach nazywane jest przeciazaniem metod (overloading)
    }
}
