package com.javiercerro.portfolio.patterns.command.factory;

import com.javiercerro.portfolio.patterns.command.entity.Command;

public abstract class CommandBuilder {

    private String type;

    protected CommandBuilder(String type){
        this.type = type;
    }

    public boolean accept(String type){
        return this.type.equalsIgnoreCase(type);
    }

    protected abstract Command build(Integer value);

}
