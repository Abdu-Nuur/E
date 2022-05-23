package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("Kosti","Alamedin 1","Ui kaytarat");
        Animal dog2 = new Dog("Kosti","Tunguch","Koy kaytarat");
        Animal cat = new Cat("Korm","Uchkun","Chychkandardy karmayt");
        Animal cat2 = new Cat("Balyk","Tunguch","Chychkandardy karmayt");
        Animal horse = new Horse("Chop","Vastok","Minebiz");



        Animal[] animals = {dog,dog2,cat,cat2,horse};



    }
}