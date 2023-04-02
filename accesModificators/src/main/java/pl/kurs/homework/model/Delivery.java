package pl.kurs.homework.model;

public class Delivery {
    private String deliveryForm;
    private Address  senderAddress;
    private Address deliveryAddress;
    private boolean fragilePackage;

    public String getDeliveryForm() {
        return deliveryForm;
    }

    public void setDeliveryForm(String deliveryForm) {
        this.deliveryForm = deliveryForm;
    }

    public Address getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(Address senderAddress) {
        this.senderAddress = senderAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public boolean isFragilePackage() {
        return fragilePackage;
    }

    public void setFragilePackage(boolean fragilePackage) {
        this.fragilePackage = fragilePackage;
    }
}
