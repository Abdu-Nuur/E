package com.company;

public class Horse extends Animal{
    private String emneKylaAlat;

    public Horse(String food, String location, String emneKylaAlat) {
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
        return "Horse{" +
                "emneKylaAlat='" + emneKylaAlat + '\'' +
                "} " + super.toString();
    }
}
