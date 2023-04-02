package pl.kurs;

public class SimpleCalculator {
    String brand;

    int getFive() {  //metoda instancji
        return 5;
    }
    static double addTwoNumbers(double d1, double d2){
       // System.out.println(brand + " kalkulator liczy wynik...");
        return d1 + d2;
    }
    double multiplicationThreeNumbers(double d1, double d2, double d3){
        return d1 * d2 * d3;}


    void addTwoNumbersAndPrint(double d1, double d2){
        System.out.println(d1 + d2);
    }
}
