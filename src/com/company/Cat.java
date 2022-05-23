package com.company;

public class Cat extends Animal{
    private String emneKylaAlat;

    public Cat(String food, String location, String emneKylaAlat) {
        super(food, location);
        this.emneKylaAlat = emneKylaAlat;
    }

    public String getEmneKylaAlat() {
        return emneKylaAlat;
    }

    public void setEmneKylaAlat(String emneKylaAlat) {
        this.emneKylaAlat = emneKylaAlat;
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "emneKylaAlat='" + emneKylaAlat + '\'' +
                "} " + super.toString();
    }
}
