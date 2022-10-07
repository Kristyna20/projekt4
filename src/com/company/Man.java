package com.company;

public class Man extends Human{
    public Man(String name, int age, int numberOfLegs, String skin, int idNumber) {
        super(name, age, numberOfLegs, skin, idNumber);
    }
    public void greetings() {
        System.out.println("Nazdar");
    }
    public void cook(){
        System.out.println("Neumim varit");
    }
}
