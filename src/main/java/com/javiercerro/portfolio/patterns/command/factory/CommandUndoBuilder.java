package com.javiercerro.portfolio.patterns.command.factory;

import com.javiercerro.portfolio.patterns.command.entity.Command;
import com.javiercerro.portfolio.patterns.command.entity.CommandUndo;

public class CommandUndoBuilder extends CommandBuilder{
    protected CommandUndoBuilder() {
        super("undo");
    }

    @Override
    protected Command build(Integer value) {
        return new CommandUndo();
    }
}
