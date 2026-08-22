package com.javiercerro.portfolio.patterns.command.factory;

import com.javiercerro.portfolio.patterns.command.entity.Command;
import com.javiercerro.portfolio.patterns.command.exception.TypeNotValidException;

import java.util.Optional;

public final class CommandFactory {

    private CommandFactory(){}

    private static final CommandBuilder[] builders = {
        new CommandSumaBuilder(),
        new CommandRestaBuilder(),
        new CommandMultiplicacionBuilder(),
        new CommandDivisionBuilder(),
        new CommandSetBuilder(),
        new CommandUndoBuilder()
    };

    public static Optional<Command> get(String type){
        return get(type, null);
    }

    public static Optional<Command> get(String type, Integer value){
        for(CommandBuilder builder : builders){
            if(builder.accept(type))
                return Optional.of(builder.build(value));
        }
        throw new TypeNotValidException(type);
    }

}
