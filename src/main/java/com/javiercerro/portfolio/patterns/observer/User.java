package com.javiercerro.portfolio.patterns.observer;

import java.util.Objects;

public class User implements Subscriber{

    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(ProgressEvent progressEvent) {
        String message = String.format(
                "[%s] → %s ha avanzado %d en el hábito \"%s\". [%s]",
                this.name,
                progressEvent.getAuthor().getName(),
                progressEvent.getAmount(),
                progressEvent.getHabit().getName(),
                progressEvent.getTimestamp()
        );
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

}
