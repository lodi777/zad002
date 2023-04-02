package org.example.model;

public class Animal {
    private String spieces;
    private int age;
    private double weight;

    public String getSpieces() {
        return spieces;
    }

    public void setSpieces(String spieces) {
        this.spieces = spieces;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal(String spieces, int age, double weight) {
        this.spieces = spieces;
        this.age = age;
        this.weight = weight;
    }

    public String toString() {
        return "Zwierze gatunek - " + spieces + " Zwierze wiek - " + age + " Zwierze waga - " + weight;
    }

}
