package com.company;

public class Mother extends Grandfather {

    public Mother(String age, String name, Food food, Outerwear outerwear) {
        super(age, name, food, outerwear);
    }

    public Mother(String age, String name) {
        super(name);
    }

    public Mother(String name) {
        super(name);
    }

    public void name(String age, String name){
    }
    public final void name(String name){
    }
}
