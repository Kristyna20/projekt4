package com.company;

public class Animal {
    private String type;



    public Animal(String type) {
        this.type = type;
    }
    public void greetings() {
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
