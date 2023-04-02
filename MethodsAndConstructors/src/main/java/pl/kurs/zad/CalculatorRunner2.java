package pl.kurs.zad;

public class CalculatorRunner2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result1 = calculator.addTwoNumbers(10, 20);
        System.out.println(result1);

        double result2 = calculator.addThreeNumbers(50, 20, 43);
        System.out.println(result2);

        double result3 = calculator.divisionTwoNumbers(14,12);
        System.out.println(result3);

        double result4 = calculator.subtractTwoNumbers(15, 14);
        System.out.println(result4);

        double result5 = calculator.multiplyTwoNumbers(5, 10);
        System.out.println(result5);
    }
}
