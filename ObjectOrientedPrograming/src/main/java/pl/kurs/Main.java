package pl.kurs;

public class Main {
    public static void main(String[] args) {
        int a = 5;


        Car audi = new Car();//audi to zmienna obiektowa/ zmienna referencyjna (potocznie referencja)
        audi.producer = "Audi";
        audi.model = "RS3";
        audi.segment = 'B';
        audi.isBrandNew = false;

        Engine audiMotor = new Engine();

        audiMotor.capacityCm3 = 2500;
        audiMotor.powerKm = 400;
        audiMotor.torqueNm = 500;

        audi.engine = audiMotor;


        System.out.println(audi);

        Car bmw = new Car();
        bmw.producer = "BMW";
        bmw.model = "M3";
        bmw.segment = 'B';
        bmw.isBrandNew = true;

        bmw.engine = new Engine();

        bmw.engine.capacityCm3 = 3000;
        bmw.engine.powerKm = 400;
        bmw.engine.torqueNm = 550;


        System.out.println(bmw);


//        Car audi2 = audi;
//
//        System.out.println(audi2);
//
//        System.out.println(audi.powerKm);
//        audi2.powerKm = 500;
//        System.out.println(audi.powerKm);
//
//        Car emptyCar = new Car();
//
//        System.out.println(emptyCar.producer);
//        System.out.println(emptyCar.powerKm);
//        System.out.println(emptyCar.segment);
//        System.out.println(emptyCar.isBrandNew);
//

        Car ghostCar = null;

        System.out.println(ghostCar);
//        System.out.println(ghostCar.producer); //rzuca wyjątek null pointer


    }
}