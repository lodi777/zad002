package pl.kurs.homework.model;

public class Employee {
    private String firstName;
    private String secondName;
    private double seniorityYears;
    private String contractType;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSeniorityYears() {
        return seniorityYears;
    }

    public void setSeniorityYears(double seniorityYears) {
        this.seniorityYears = seniorityYears;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
