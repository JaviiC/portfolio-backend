package com.javiercerro.portfolio.patterns.command.factory;

import com.javiercerro.portfolio.patterns.command.entity.Command;
import com.javiercerro.portfolio.patterns.command.entity.CommandResta;

public class CommandRestaBuilder extends CommandBuilder{
    protected CommandRestaBuilder() {
        super("resta");
    }

    @Override
    protected Command build(Integer value) {
        return new CommandResta(value);
    }
}
