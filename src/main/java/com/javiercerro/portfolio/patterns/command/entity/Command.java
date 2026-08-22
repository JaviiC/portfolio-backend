package com.javiercerro.portfolio.patterns.command.entity;

import com.javiercerro.portfolio.patterns.command.manager.CommandManager;

public interface Command {
    void execute(CommandManager manager);
    void undo(CommandManager manager);
}
