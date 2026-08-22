package com.javiercerro.portfolio.patterns.command;

public class LightOnCommand implements Command {
    @Override
    public String execute() {
        return "Luz encendida";
    }

    @Override
    public String description() {
        return "LIGHT_ON";
    }
}
