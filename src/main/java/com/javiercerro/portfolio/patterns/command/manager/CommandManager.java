package com.javiercerro.portfolio.patterns.command.manager;

import com.javiercerro.portfolio.patterns.command.entity.Calculator;
import com.javiercerro.portfolio.patterns.command.entity.Command;
import com.javiercerro.portfolio.patterns.command.entity.UniqueOperation;
import com.javiercerro.portfolio.patterns.command.exception.TypeNotValidException;
import com.javiercerro.portfolio.patterns.command.factory.CommandFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CommandManager {

    private List<Command> colaDeComandos;
    private List<Command> historial;

    public CommandManager(){
        colaDeComandos = new LinkedList<>();
        historial = new LinkedList<>();
    }

    public double execute(){
        Command command = colaDeComandos.getFirst();
        command.execute(this);
        return Calculator.getInstance().getTotal();
    }

    public void registrarOperacion(String operationExp){

        if (operationExp == null || operationExp.isBlank())
            throw new TypeNotValidException(operationExp);

        String[] operationArray = operationExp.trim().split("\\s+");
        String operation = null;
        Integer value = null;

        switch (operationArray.length){
            case 1 -> {
                operation = operationArray[0];
            }
            case 2 -> {
                UniqueOperation uniqueOperation = new UniqueOperation(operationArray);
                operation = uniqueOperation.getOperation();
                value = uniqueOperation.getValue();
            }
        }
        Optional<Command> commandOpt = CommandFactory.get(operation, value);

        if(commandOpt.isEmpty())
            throw new TypeNotValidException(operation);

        colaDeComandos.add(commandOpt.get());
    }

    public List<Command> getColaDeComandos() {
        return colaDeComandos;
    }

    public List<Command> getHistorial() {
        return historial;
    }

    public boolean hasPending() {
        return !colaDeComandos.isEmpty();
    }
}


