package com.javiercerro.portfolio.patterns.command.factory;

import com.javiercerro.portfolio.patterns.command.entity.Command;
import com.javiercerro.portfolio.patterns.command.entity.CommandSet;

public class CommandSetBuilder extends CommandBuilder{
    protected CommandSetBuilder() {
        super("set");
    }

    @Override
    protected Command build(Integer value) {
        return new CommandSet(value);
    }
}
