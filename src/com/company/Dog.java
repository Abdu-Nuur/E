package com.company;

public class Dog extends Animal implements Veterenar{

    private String emneKylaAlat;

    public Dog(String food, String location, String emneKylaAlat) {
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
        return "Dog{" +
                "emneKylaAlat='" + emneKylaAlat + '\'' +
                "} " + super.toString();
    }

    @Override
    public void treatAnimal(Animal animal) {
        System.out.println(getFood());
    }
}
