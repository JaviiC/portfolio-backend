package com.javiercerro.portfolio.patterns.command.entity;

import com.javiercerro.portfolio.patterns.command.manager.CommandManager;

public class CommandSuma implements Command {

    private final int value;

    public CommandSuma(int value){
        this.value = value;
    }

    @Override
    public void execute(CommandManager manager) {
        Calculator.getInstance().suma(value);
        manager.getColaDeComandos().remove(this);
        manager.getHistorial().add(this);
    }

    @Override
    public void undo(CommandManager manager) {
        Calculator.getInstance().resta(value);
    }

}
