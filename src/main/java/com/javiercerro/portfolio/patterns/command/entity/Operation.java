package com.javiercerro.portfolio.patterns.command.entity;

public abstract class Operation {

    String operation;

    protected Operation(){
    }

    public String getOperation(){
        return operation;
    }

}
