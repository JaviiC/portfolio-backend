package com.javiercerro.portfolio.patterns.observer;

public interface Subscriber {
    void update(ProgressEvent progressEvent);
    String getName();
}
