package com.javiercerro.portfolio.patterns.command.entity;

import com.javiercerro.portfolio.patterns.command.manager.CommandManager;

public class CommandSet implements Command {

    private final int value;

    public CommandSet(int value){
        this.value = value;
    }

    @Override
    public void execute(CommandManager manager) {
        Calculator.getInstance().set(value);
        manager.getColaDeComandos().remove(this);
        manager.getHistorial().removeAll(manager.getHistorial());
    }

    @Override
    public void undo(CommandManager manager) {
    }

}
