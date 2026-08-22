package com.javiercerro.portfolio.patterns.command.entity;

import com.javiercerro.portfolio.patterns.command.manager.CommandManager;

public class CommandDivide implements Command{

    private final int value;

    public CommandDivide(int value){
        this.value = value;
    }

    @Override
    public void execute(CommandManager manager) {
        Calculator.getInstance().divide(value);
        manager.getColaDeComandos().remove(this);
        manager.getHistorial().add(this);
    }

    @Override
    public void undo(CommandManager manager) {
        Calculator.getInstance().multiplica(value);
    }
}
