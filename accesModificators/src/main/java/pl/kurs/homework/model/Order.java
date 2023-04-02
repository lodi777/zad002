package pl.kurs.homework.model;

public class Order {
    private String date;
    private String items;
    private Customer customer;
    private Employee packer;
    private Delivery delivery;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getPacker() {
        return packer;
    }

    public void setPacker(Employee packer) {
        this.packer = packer;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
