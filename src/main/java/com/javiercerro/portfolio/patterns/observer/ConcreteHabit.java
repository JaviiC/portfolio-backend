package com.javiercerro.portfolio.patterns.observer;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ConcreteHabit implements Habit{

    private String name;
    private Integer goal;
    private User author;
    private Set<Subscriber> subscribers;

    public ConcreteHabit(String name, Integer goal, User author) {
        this.name = name;
        this.goal = goal;
        this.author = author;
        subscribers = new HashSet<>();
        System.out.println("- - - Nuevo hábito creado -> " + name + ", por " + author.getName());
    }

    @Override
    public void subscribe(Subscriber s) {
        if(subscribers.add(s))
            System.out.println("[" + s.getName() + "] se ha suscrito al hábito -> " + this.name);
        else
            System.out.println("[" + s.getName() + "] ya se encuentra suscrito a \"" + this.name + "\"");
    }

    @Override
    public void unsibscribe(Subscriber s) {
        if(subscribers.remove(s))
            System.out.println("- [" + s.getName() + "] se ha dado de baja en el hábito -> " + this.name);
    }

    @Override
    public void recordProgress(Integer progressUnit) {
        ProgressEvent event = new ProgressEvent(this, author, progressUnit, LocalDateTime.now());
        notifyProgress(event);
    }

    @Override
    public void notifyProgress(ProgressEvent event) {
        for(Subscriber subscriber : subscribers){
            subscriber.update(event);
        }
    }

    public String getName() {
        return name;
    }

    public Integer getGoal() {
        return goal;
    }

    public User getAuthor() {
        return author;
    }

    public Set<Subscriber> getSubscribers() {
        return subscribers;
    }
}
