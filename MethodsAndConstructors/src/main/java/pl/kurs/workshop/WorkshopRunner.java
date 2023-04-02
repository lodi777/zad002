package pl.kurs.workshop;

public class WorkshopRunner {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", "F458", 600, 800, "Red");
        Person mietek = new Person("Mieczysła", "Zwierz", 100_000);
        mietek.buyCar(ferrari);
        //mietek.sellCar();

        CarWorkshop boschService = new CarWorkshop(mietek);
        String welcome = boschService.welcomeCustomer();
        System.out.println(welcome);

        boschService.increasePowerAndTorque(100, 100);


        boschService.changeCarColor("Yellow");

        String presentCarToCustomer = boschService.presentCarToCustomer();
        System.out.println(presentCarToCustomer);


    }
}
