package com.javiercerro.portfolio.patterns.command.factory;

import com.javiercerro.portfolio.patterns.command.entity.Command;
import com.javiercerro.portfolio.patterns.command.entity.CommandDivide;

public class CommandDivisionBuilder extends CommandBuilder{

    protected CommandDivisionBuilder() {
        super("divide");
    }

    @Override
    protected Command build(Integer value) {
        return new CommandDivide(value);
    }

}
