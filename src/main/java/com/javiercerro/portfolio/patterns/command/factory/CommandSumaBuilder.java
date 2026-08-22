package com.javiercerro.portfolio.patterns.command.factory;

import com.javiercerro.portfolio.patterns.command.entity.Command;
import com.javiercerro.portfolio.patterns.command.entity.CommandSuma;

public class CommandSumaBuilder extends CommandBuilder{
    protected CommandSumaBuilder() {
        super("suma");
    }

    @Override
    protected Command build(Integer value) {
        return new CommandSuma(value);
    }
}