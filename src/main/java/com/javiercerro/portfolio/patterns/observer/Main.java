package com.javiercerro.portfolio.patterns.observer;

public class Main {

    public static void main(String[] args) {

        User paula = new User("Paula");
        User javi = new User("Javi");

        Subscriber sub1 = new User("Jorge");
        Subscriber sub2 = new User("Valentina");
        Subscriber sub3 = new User("Luis");
        Subscriber sub4 = new User("Cristina");
        Subscriber sub5 = new User("Marta");

        Habit agua = new ConcreteHabit("Beber 2L de agua", 2000, paula);
        Habit ejercicio = new ConcreteHabit("Hacer 30 min de ejercicio", 30, javi);

        agua.subscribe(sub1);
        agua.subscribe(sub1);
        agua.subscribe(sub2);
        ejercicio.subscribe(sub3);
        ejercicio.subscribe(sub4);
        ejercicio.subscribe(sub5);

        agua.recordProgress(30);
        ejercicio.recordProgress(15);
        agua.unsibscribe(sub1);
        agua.recordProgress(10);

    }

}
