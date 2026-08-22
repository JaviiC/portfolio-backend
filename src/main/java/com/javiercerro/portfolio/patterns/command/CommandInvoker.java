package com.javiercerro.portfolio.patterns.command;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * COMMAND — el invocador no sabe qué hace cada acción, solo la ejecuta
 * y guarda su historial.
 */
public class CommandInvoker {

    public record HistoryEntry(String command, String result, LocalDateTime executedAt) {}

    private final List<HistoryEntry> history = new ArrayList<>();

    public String run(Command command) {
        String result = command.execute();
        history.add(new HistoryEntry(command.description(), result, LocalDateTime.now()));
        return result;
    }

    public List<HistoryEntry> history() {
        return List.copyOf(history);
    }
}
