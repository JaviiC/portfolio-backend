package com.javiercerro.portfolio.patterns.command.factory;

import com.javiercerro.portfolio.patterns.command.entity.Command;
import com.javiercerro.portfolio.patterns.command.entity.CommandMultiplica;

public class CommandMultiplicacionBuilder extends CommandBuilder{
    protected CommandMultiplicacionBuilder() {
        super("multiplica");
    }

    @Override
    protected Command build(Integer value) {
        return new CommandMultiplica(value);
    }
}
