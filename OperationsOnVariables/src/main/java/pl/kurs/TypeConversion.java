package pl.kurs;

public class TypeConversion {
    public static void main(String[] args) {
        double firstNumber = 30.999;
        int secondNumber = 10;


        int narrowedFirstNumber = (int) firstNumber; //casting czyli rzutowanie
        double widenedSecondNumber = secondNumber;

        System.out.println(narrowedFirstNumber);
        System.out.println(widenedSecondNumber);

        double d1 = 1.12345678901234567890;
        float f1 = (float) d1;

        System.out.println(f1);

        short s1 = 130;
        byte b1 = (byte) s1;

        System.out.println(b1);


    }
}
