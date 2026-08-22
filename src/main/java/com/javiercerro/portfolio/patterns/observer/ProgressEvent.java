package com.javiercerro.portfolio.patterns.observer;

import java.time.LocalDateTime;

public class ProgressEvent {

    private final User author;
    private final Habit habit;
    private final Integer amount;
    private final LocalDateTime timestamp;

    public ProgressEvent(Habit habit, User author, Integer amount, LocalDateTime timestamp) {
        this.habit = habit;
        this.author = author;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public User getAuthor() {
        return author;
    }

    public Habit getHabit() {
        return habit;
    }

    public Integer getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
