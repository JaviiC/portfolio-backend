package com.javiercerro.portfolio.patterns.command.entity;

import com.javiercerro.portfolio.patterns.command.manager.CommandManager;

public class CommandUndo implements Command{
    @Override
    public void execute(CommandManager manager) {
        if(manager.getHistorial().isEmpty())
            System.out.println("El historial de operaciones se encuentra vacío");
        else {
            Command command = manager.getHistorial().removeLast();
            command.undo(manager);
        }
    }

    @Override
    public void undo(CommandManager manager) {
    }

}
