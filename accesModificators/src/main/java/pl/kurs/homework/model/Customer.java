package pl.kurs.homework.model;

public class Customer {
    private String firstName;
    private String secondName;
    private boolean premiumCustomer;

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

    public boolean isPremiumCustomer() {
        return premiumCustomer;
    }

    public void setPremiumCustomer(boolean premiumCustomer) {
        this.premiumCustomer = premiumCustomer;
    }
}
