package pl.kurs;

public class LogicOperators {
    public static void main(String[] args) {
        //  && - operator koniunkcji (iloczyn logiczny) – zwraca TRUE tylko i wyłącznie wtedy kiedy TRUE && TRUE
        //  || - operator alternatywy (suma logiczna)– zwraca TRUE, gdy co najmniej jeden z warunków jest spełniony czyli TRUE np.: TRUE || FALSE lub FALSE || TRUE lub TRUE || TRUE
        //      (Warto dodać, że jeżeli pierwszy warunek jest TRUE to już następnego nie sprawdza)
        //
        //  ! –operator negacji – zwraca przeciwieństwo wartości logicznej będącej parametrem np. :
        //      !true = false, !false = true

        System.out.println(3 > 1 && 'c' != 99 && 1 == 1); // 1 * 0 * 1 = 0
        System.out.println(3 > 1 || 'c' != 99 || 1 == 1); // 1 + 0 + 1 = 2
        System.out.println(3 > 1 || 'c' != 99 && 1 == 1); // (1 + 0) * 1 = 1
        System.out.println(3 > 1 && 'c' != 99 || 1 == 1); // (1 * 0) + 1 = 1

        System.out.println();
        System.out.println(!true);
        System.out.println(!false);


        System.out.println();

        int a = 5;
        int b = 10;
        boolean logic = true;

        System.out.print("a<10 && b<11? ");
        System.out.println(a < 10 && b < 11); //true

        System.out.print("a<10 && b<10? ");
        System.out.println(a < 10 && b < 10); //false

        System.out.print("a<10 || b<10? ");
        System.out.println(a < 10 || b < 10); //true

        System.out.print(logic);
        System.out.print(" , !logic = ");
        System.out.println(!logic); //false

        System.out.print("Warunek złożony !(a<10 && b<10) ");
        System.out.println(!(a < 10 && b < 10)); //true




    }
}
