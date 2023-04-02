package pl.kurs;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        SimpleCalculator calculatorCasio = new SimpleCalculator();
        calculatorCasio.brand = "Casio";

        System.out.println(calculatorCasio.getFive());

        int result1 = calculatorCasio.getFive(); //to co po prawej to methodCall

        System.out.println(result1);

        double result2 = SimpleCalculator.addTwoNumbers(125.78, 1273.14);
        System.out.println(result2);

        calculatorCasio.addTwoNumbersAndPrint(10, 20);

        Car alfaRomeo = new Car();
        alfaRomeo.producer = "Alfa Romeo";
        alfaRomeo.model = "Giulia";
        alfaRomeo.color = "Red";

        String carInfo = alfaRomeo.getInfo();
        System.out.println(carInfo); //Red Alfa Romeo Giulia

        alfaRomeo.printInfo();

        Car audi = new Car();
        audi.producer = "Audi";
        audi.model = "E-tron Gt";
        audi.color = "Blue";


        audi.printInfo();

        CarPainter carPainter = new CarPainter();
        carPainter.changeCarColor("Red", audi);
        audi.printInfo();

        CarFactory carFactory = new CarFactory();

        Car furaDlaMojejStarej = carFactory.createBranNewCar("Mini", "Cooper", "Czerwony");

        furaDlaMojejStarej.printInfo();

        Car merc = new Car("MB", "C63S", "White");

        merc.printInfo();

        Car lada = new Car("Łada", "Niva", "Szary", 1967);

        lada.printInfo();




    }

    static void doFoo() {
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);

    }



}