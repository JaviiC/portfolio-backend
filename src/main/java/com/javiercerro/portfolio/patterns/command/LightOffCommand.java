package com.javiercerro.portfolio.patterns.command;

public class LightOffCommand implements Command {
    @Override
    public String execute() {
        return "Luz apagada";
    }

    @Override
    public String description() {
        return "LIGHT_OFF";
    }
}
