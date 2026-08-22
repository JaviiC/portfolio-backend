package com.javiercerro.portfolio.patterns.command.entity;

import com.javiercerro.portfolio.patterns.command.manager.CommandManager;

public class CommandResta implements Command{

    private final int value;

    public CommandResta(int value){
        this.value = value;
    }

    @Override
    public void execute(CommandManager manager) {
        Calculator.getInstance().resta(value);
        manager.getColaDeComandos().remove(this);
        manager.getHistorial().add(this);
    }

    @Override
    public void undo(CommandManager manager) {
        Calculator.getInstance().suma(value);
    }
}
