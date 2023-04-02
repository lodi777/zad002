package pl.kurs;

public class IncrementDecrementOperators {

    public static void main(String[] args) {

        int a = 3;
        int b = 6;

        a++; //postinkrementacja / inkrementacja przyrostkowa/ inkrementacja postfixowa
        ++a; //preinkrementacja /.. inkrementacja przedrostkowa / inkr. prefixowa
        b--; //postdekrementacja...
        --b; // predekrementacja..


        System.out.println(a);
        System.out.println(b);


        int m = 7;
        int n = 7;
        int result1 = 2 * ++m;  //result1=16 , m= 8
        int result2 = 2 * n++; //result2=14 , n= 8
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(m);
        System.out.println(n);


        int x = 10;
        System.out.println(x++);
        System.out.println(x);
    }
}
