package com.company;

public abstract class Grandfather {

    private String age;
    private String name;
    private Food food;
    private Outerwear outerwear;

    public String getAge() {
        return age;
    }

    public Grandfather(String mona) {
    }

    public String getName() {
        return name;
    }

    public Food getFood() {
        return food;
    }

    public Outerwear getOuterwear() {
        return outerwear;
    }

    public Grandfather(String age, String name, Food food, Outerwear outerwear) {
        this.age = age;
        this.name = name;
        this.food = food;
        this.outerwear = outerwear;
    }
    public final String getInfo(){
        return "Age: " + getAge() +
                "\nName: " + getName() +
                "\nFood: " + getFood() +
                "\nOuterwear: " + getOuterwear();
    }
}
