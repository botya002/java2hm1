package com.company;

public class Main {

    public static void main(String[] args) {
        Mother mona = new Mother("33","Mona");
        Son alex = new Son("14", "Alex");
        Son dima = new Son("10", "Dima");

        System.out.println(mona.getInfo());
    }
}
