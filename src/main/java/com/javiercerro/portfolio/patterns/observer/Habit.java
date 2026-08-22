package com.javiercerro.portfolio.patterns.observer;

public interface Habit {
    void subscribe(Subscriber subscriber);
    void unsibscribe(Subscriber subscriber);
    void recordProgress(Integer progressUnit);
    void notifyProgress(ProgressEvent event);
    String getName();
}
