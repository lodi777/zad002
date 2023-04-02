package pl.kurs.workshop;

public class CarWorkshop {
    Person customer; //pole
    Car customerCar; //pole

    public CarWorkshop(Person customer) {
        this.customer = customer;
        this.customerCar = customer.ownedCar;
    }
    String welcomeCustomer(){
        return "Welcome " + customer.firstName + " " + customer.secondName + ". Your car is " + customerCar.producer + " " + customerCar.model;

    }
    void increasePowerAndTorque(int additionalPower, int additionalTorque){
      customerCar.powerHp += additionalPower;
      customerCar.torqueNm += additionalTorque;

    }
    void changeCarColor(String newColor) {
        customerCar.color = newColor;
    }
    String presentCarToCustomer(){
        return "Power and torque is changed for " + customerCar.powerHp + "HP " + customerCar.torqueNm
                + "Nm and new color is " + customerCar.color;
    }





}
